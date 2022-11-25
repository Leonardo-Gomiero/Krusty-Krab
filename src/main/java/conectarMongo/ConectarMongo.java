package conectarMongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class ConectarMongo {
    static String database = "PokeDuel";
    static String collection = "Pokemons";
    
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
    
    public static String selecionarNome(int pokedex){
        String name = "";
        System.out.println("Select Name");
        String uri = "mongodb://localhost";
        MongoClient mongo = MongoClients.create(uri);
        MongoDatabase db = mongo.getDatabase("pokeduel");
        MongoCollection<Document> docs =
                db.getCollection("pokemons");
        Document doc = docs.find(Filters.eq("_id", pokedex)).first();
        name = doc.getString("Name");
        System.out.println(name);
        return name;
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
