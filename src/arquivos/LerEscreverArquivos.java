package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Produtos;
import classes.Usuarios;

public class LerEscreverArquivos {
	
private String nomeArquivo;
	
	public LerEscreverArquivos(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	/* ----------------------------------------------USU�RIOS--------------------------------------------- */
	public void escreverArquivos(List<Usuarios> usuarios) {
		FileOutputStream saida;

		try {
			
			saida = new FileOutputStream(nomeArquivo); /* criar arquivo de nome Crian�a.bin */
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(usuarios); /* gravando objeto */
			objeto.close();
			JOptionPane.showMessageDialog(null, "Usu�rio Cadastrado com Sucesso");
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo N�o Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuarios> lerArquivos() {
		List<Usuarios> usuarios = null;
		try {
			
			FileInputStream entrada = new FileInputStream(nomeArquivo);
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			usuarios = (List<Usuarios>) objeto.readObject();
			objeto.close();
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo N�o Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo Corrompido", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Classe N�o Encontrada", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return usuarios;
	}
	
	/* ----------------------------------------------PRODUTOS--------------------------------------------- */
	public void escreverArquivosProdutos(List<Produtos> produtos) {
		FileOutputStream saida;

		try {
			
			saida = new FileOutputStream(nomeArquivo); /* criar arquivo de nome Crian�a.bin */
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(produtos); /* gravando objeto */
			objeto.close();
			JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso");
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo N�o Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	public List<Produtos> lerArquivosProdutos() {
		List<Produtos> produtos = null;
		try {
			
			FileInputStream entrada = new FileInputStream(nomeArquivo);
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			produtos = (List<Produtos>) objeto.readObject();
			objeto.close();
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo N�o Encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "Arquivo Corrompido", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "Classe N�o Encontrada", "Arquivo", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return produtos;
	}
}
