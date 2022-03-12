package classes;

import java.io.Serializable;
 

@SuppressWarnings("serial")
public class Produtos implements Serializable {
    //declarar variaveis
	protected float preco;  
	protected int garantia;
	protected String codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Produtos(float preco, int garantia, String codigo, String fabricante, String marca,
			String localOrigem, String cor, String anoModelo, String anoFabricacao, String tipoProduto) {
		super();
		this.preco = preco;
		this.garantia = garantia;
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.marca = marca;
		this.localOrigem = localOrigem;
		this.cor = cor;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.tipoProduto = tipoProduto;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return null;
	}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}