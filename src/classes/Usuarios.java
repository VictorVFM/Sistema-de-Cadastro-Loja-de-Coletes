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
	
	/*------------------------------------M�TODO MOSTRAR NOME DO USU�RIO--------------------------------------------*/
	public String mostrarNomes() {
		return "\n" + "\nNome Completo: " + this.nome + " " + this.sobrenome; 
	}
	
	/*------------------------------------M�TODO MOSTRAR USU�RIO E SENHA--------------------------------------------*/
	public String mostrarUsuario() {
		return "\n" + "\nNome de Usu�rio: " + this.nomeUsuario +
				"\nSenha do Usu�rio: " + this.senha;
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
