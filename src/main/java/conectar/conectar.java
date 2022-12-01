package conectar;

import java.sql.*;

public class conectar {

    private static Connection conexao_MySql = null;
    private static String localBD = "localhost";
    private static String LINK = "jdbc:mysql://" + localBD + ":3306/teste1";
    private static final String usuario = "root";
    private static final String senha = "senha123";
    
    public String nomeUsuario = "";

    // Método para fazer a conexão com um banco de dados MySql
    public Connection connectionMySql() {

        try {
            conexao_MySql = DriverManager.getConnection(LINK, usuario, senha);
            System.out.println("conexão OK!");
        } catch (SQLException e) {
            throw new RuntimeException("Ocorreu um problema na conexão com o BD", e);
        }
        return conexao_MySql;
    }

    public void consulta(Connection con) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from dados");
            System.out.println("Consulta ao banco:");
            while (rs.next()) {
                System.out.println("cod: " + rs.getInt(1) + " - Nome: " + rs.getString(2) + " - Email: " + rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public String PegarSenha(Connection con, String email) {
        String senhaVerdadeira = "";
    	try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select senha from dados where email =" + "\"" + email + "\"");
            System.out.println("select senha from dados where email = " + email);
            while (rs.next()) {
            	senhaVerdadeira = rs.getString(1);
                System.out.println("Pegando senha de " + email + ":" + " " + senhaVerdadeira);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return senhaVerdadeira;

    }
    
    public String pegarNome(Connection con, String email) {
        String nome = "";
    	try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select nome from dados where email =" + "\"" + email + "\"");
            System.out.println("select nome from dados where email = " + email);
            while (rs.next()) {
            	nome = rs.getString(1);
                System.out.println("Pegando nome de " + email + ":" + " " + nome);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        this.nomeUsuario = nome;
        return nome;

    }

    public String dataBaseSelect(int code) {
        Connection connection = connectionMySql();
        String x = "";
        String sql = "Select codigo, nome, email "
                + "from dados "
                + "where codigo=?";

        PreparedStatement preparedStmt;
        try {
            preparedStmt = connection.prepareStatement(sql);
            //Efetua a troca do '?' pelos valores na query
            preparedStmt.setInt(1, code);
            ResultSet result = preparedStmt.executeQuery();
            //valida resultado
            while (result.next()) {
                int cod = result.getInt("codigo");
                String name = result.getString("nome");
                String email = result.getString("email");
                System.out.println("cod: " + cod);
                System.out.println("name: " + name);
                System.out.println("email : " + email);
                x = name;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return x;
    }

    public void cadastrarCliente(String nome, String email, String senha) {
        Connection connection = connectionMySql();
        String sql = "INSERT INTO dados VALUES (null,?,?,?)";
        PreparedStatement preparedStmt;
        try {
            preparedStmt = connection.prepareStatement(sql);
            //Efetua a troca do '?' pelos valores na query 			
            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, email);
            preparedStmt.setString(3, senha);
            preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnectionMySql(Connection con) {
        try {
            if (con != null) {
                con.close();
                System.out.println("Fechamento OK");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Ocorreu um problema para encerrar a conexão com o BD.", e);
        }
    }

}

