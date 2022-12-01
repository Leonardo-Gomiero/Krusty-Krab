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

	public String nomeUsuario = "";

	@RequestMapping("/form")
	public String Form(Model modelo) {
		System.out.println("Formulário");

		System.setProperty("java.awt.headless", "false");
		modelo.addAttribute("mensagem", "Formulário de Inscrição");

		return "form";
	}

	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.POST)
	public String RespForm(Model modelo, String nome, String email, String senha1, String senha2) {
		System.out.println("Cadastrando cliente");
		String senha = "";
		conectar obj = new conectar();
		Connection conexao = obj.connectionMySql();
		
		if(senha1.equals(senha2)) {
			obj.cadastrarCliente(nome, email, senha1);
			obj.closeConnectionMySql(conexao);
			
			this.nomeUsuario = nome;
			modelo.addAttribute("mensagem", this.nomeUsuario);
			return "index";
		}
		else {
			modelo.addAttribute("mensagem", "As senhas não coincidem.");
			return "cadastro";
		}
		
		
	}

	@RequestMapping("/banco")
	public String Banco(Model modelo) {
		System.out.println("Banco");
		return "banco";
	}

	@RequestMapping("/home")
	public String Home(Model modelo) {
		System.out.println("Home");
		modelo.addAttribute("mensagem", this.nomeUsuario);
		return "index";
	}

	@RequestMapping("/cardapio")
	public String Cardapio(Model modelo) {
		System.out.println("Cardapio");
		modelo.addAttribute("mensagem", this.nomeUsuario);
		
		modelo.addAttribute("mensagem1", ConectarMongo.selecionarNome(2));
		modelo.addAttribute("mensagem2", ConectarMongo.selecionarPreco(2));
		modelo.addAttribute("mensagem3", ConectarMongo.selecionarDescricao(2));

		modelo.addAttribute("mensagem4", ConectarMongo.selecionarNome(3));
		modelo.addAttribute("mensagem5", ConectarMongo.selecionarPreco(3));
		modelo.addAttribute("mensagem6", ConectarMongo.selecionarDescricao(3));
		
		modelo.addAttribute("mensagem7", ConectarMongo.selecionarNome(4));
		modelo.addAttribute("mensagem8", ConectarMongo.selecionarPreco(4));
		modelo.addAttribute("mensagem9", ConectarMongo.selecionarDescricao(4));
		
		modelo.addAttribute("mensagem10", ConectarMongo.selecionarNome(5));
		modelo.addAttribute("mensagem11", ConectarMongo.selecionarPreco(5));
		modelo.addAttribute("mensagem12", ConectarMongo.selecionarDescricao(5));
		
		modelo.addAttribute("mensagem13", ConectarMongo.selecionarNome(6));
		modelo.addAttribute("mensagem14", ConectarMongo.selecionarPreco(6));
		modelo.addAttribute("mensagem15", ConectarMongo.selecionarDescricao(6));
		
		modelo.addAttribute("mensagem16", ConectarMongo.selecionarNome(7));
		modelo.addAttribute("mensagem17", ConectarMongo.selecionarPreco(7));
		modelo.addAttribute("mensagem18", ConectarMongo.selecionarDescricao(7));
		
		modelo.addAttribute("mensagem19", ConectarMongo.selecionarNome(8));
		modelo.addAttribute("mensagem20", ConectarMongo.selecionarPreco(8));
		modelo.addAttribute("mensagem21", ConectarMongo.selecionarDescricao(8));
		
		modelo.addAttribute("mensagem22", ConectarMongo.selecionarNome(9));
		modelo.addAttribute("mensagem23", ConectarMongo.selecionarPreco(9));
		modelo.addAttribute("mensagem24", ConectarMongo.selecionarDescricao(9));
		
		modelo.addAttribute("mensagem25", ConectarMongo.selecionarNome(10));
		modelo.addAttribute("mensagem26", ConectarMongo.selecionarPreco(10));
		modelo.addAttribute("mensagem27", ConectarMongo.selecionarDescricao(10));
		
		
		return "cardapio";
	}

	@RequestMapping("/pedido")
	public String Pedido(Model modelo) {
		System.out.println("Pedido");
		modelo.addAttribute("mensagem", this.nomeUsuario);
		return "pedido";
	}

	@RequestMapping("/sobre")
	public String Sobre(Model modelo) {
		System.out.println("Sobre");
		modelo.addAttribute("mensagem", this.nomeUsuario);
		return "sobre";
	}

	@RequestMapping("/contato")
	public String Contato(Model modelo) {
		System.out.println("Contato");
		modelo.addAttribute("mensagem", this.nomeUsuario);
		return "contato";
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
		String nome = obj.pegarNome(conexao, uname);

		obj.closeConnectionMySql(conexao);

		System.out.println("Usuario: " + uname);
		System.out.println("Senha: " + psw);
		System.out.println("Senha verdadeira: " + senha);
		System.out.println("Nome: " + nome);
		if (senha.equals(psw)) {
			modelo.addAttribute("mensagem", nome);
			this.nomeUsuario = nome;
			return "index";
		} else {
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
