package SpringBancoSQL;

import Projeto.*;
import conectar.conectar;
import conectarMongo.ConectarMongo;
import java.sql.Connection;
import javax.swing.JFrame;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    
    
    @RequestMapping("/form")
    public String Form(Model modelo) {
        System.out.println("Formulário");
        
        System.setProperty("java.awt.headless", "false");
        modelo.addAttribute("mensagem", "Formulário de Inscrição");

        return "form";
    }

    @RequestMapping(value = "/respostaForm", method = RequestMethod.POST)
    public String RespForm(Model modelo, String nome, String email,
            int code, String profissao, boolean trab) {
        System.out.println("Resposta do form");
        modelo.addAttribute("mensagem1", "Olá " + nome + ", seu email é:"
                + email);
        conectar obj = new conectar();
        Connection conexao = obj.connectionMySql();
        obj.dataBaseInsert(nome, email);
        obj.closeConnectionMySql(conexao);

        ConectarMongo con = new ConectarMongo();
        con.insertValues(nome, email, code, profissao, trab);
        con.getValues();

        Login login = new Login();
        login.setVisible(true);
        return "respostaForm";
    }

    @RequestMapping("/banco")
    public String Banco(Model modelo) {
        System.out.println("Banco");
        return "banco";
    }

    @RequestMapping(value = "/respostaBanco", method = RequestMethod.POST)
    public String RespBanco(Model modelo, String code) {
        System.out.println("Resposta Banco");
        conectar obj = new conectar();
        Connection conexao = obj.connectionMySql();
        String x = obj.dataBaseSelect(Integer.parseInt(code));
        modelo.addAttribute("mensagem2", "Olá, " + x + ", como você está?");
        obj.closeConnectionMySql(conexao);
        return "respostaBanco";
    }
    
    @RequestMapping(value = "/fazerLogin", method = RequestMethod.GET)
    public String Login(Model modelo, String uname, String psw) {
        System.out.println("Realizando Login");
        
        conectar obj = new conectar();
        Connection conexao = obj.connectionMySql();
        
        String senha = obj.PegarSenha(conexao, uname);
        obj.closeConnectionMySql(conexao);
        
        System.out.println("Usuario: " + uname);
        System.out.println("Senha: " + psw);
        System.out.println("Senha verdadeira: " + senha);
        if (senha.equals(psw)) {
        	modelo.addAttribute("mensagem1", ConectarMongo.selecionarNome(487));
     
        	return "form";
        }
        else {
        	modelo.addAttribute("mensagem", "Email ou senha incorretos. Tente novamente.");
        	return "login";
        }
        
    }

    @RequestMapping("/bancoM")
    public String BancoMDB(Model modelo) {
        System.out.println("Banco Mongo DB");
        return "bancoM";
    }

    
}
