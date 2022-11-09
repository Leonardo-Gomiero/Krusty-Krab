package conectarMongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class ConectarMongo {
    String database = "teste1";
    String collection = "dados";
    
    public void getValues(){
        System.out.println("get Values");
        String uri = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(uri);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs =
                db.getCollection(collection);
        for (Document doc:docs.find()){
            System.out.println("item: "+doc);
        }        
    }
    
    public String selectValues(int x){
        String y = "";
        System.out.println("Select Values");
        String uri = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(uri);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs =
                db.getCollection(collection);
        Document doc = docs.find(Filters.eq("_id",x)).first();
        y = doc.getString("nome");
        return y;
    }
    public void insertValues(String Nome, String email,
            int code, String profissao, boolean trab){
        System.out.println("insert Values");
        String uri = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(uri);
        MongoDatabase db = mongo.getDatabase(database);
        MongoCollection<Document> docs =
                db.getCollection(collection);
        Document docBuilder = new Document();
        docBuilder.append("_id", code);
        docBuilder.append("nome", Nome);
        docBuilder.append("email",email);
        docBuilder.append("profissao",profissao);
        docBuilder.append("esta_trabalhando", trab);
        docs.insertOne(docBuilder);
    }
}
