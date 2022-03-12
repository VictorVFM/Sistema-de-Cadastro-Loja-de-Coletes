package classes;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuarios implements Serializable{

	protected String nome, sobrenome, nomeUsuario, senha;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Usuarios(String nome, String sobrenome, String nomeUsuario, String senha) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}
	
	/*------------------------------------MÉTODO MOSTRAR NOME DO USUÁRIO--------------------------------------------*/
	public String mostrarNomes() {
		return "\n" + "\nNome Completo: " + this.nome + " " + this.sobrenome; 
	}
	
	/*------------------------------------MÉTODO MOSTRAR USUÁRIO E SENHA--------------------------------------------*/
	public String mostrarUsuario() {
		return "\n" + "\nNome de Usuário: " + this.nomeUsuario +
				"\nSenha do Usuário: " + this.senha;
	}
	
	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSenha() {
		return senha;
	}
}
