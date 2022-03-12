package classes;

@SuppressWarnings("serial")
public class Boia extends Produtos {

	private String tamanho, peso, certificacao;
	private int quantidadeBoia;

	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Boia(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String tamanho, String peso,
			String certificacao, int quantidadeBoia) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.tamanho = tamanho;
		this.peso = peso;
		this.certificacao = certificacao;
		this.quantidadeBoia = quantidadeBoia;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeBoia +
				"\nGarantia: "+this.garantia +
				"\nCódigo: "+ this.codigo +
				"\nFabricante: " + this.fabricante +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nMarca: " + this.marca +
				"\nAno do Modelo: "+ this.anoModelo +
				"\nCor: "+ this.cor +
				"\nLocal de Origem: "+ this.localOrigem +
				"\nTamanho: " + this.tamanho + 
				"\nPeso: " + this.peso + 
				"\nCertificação: " + this.certificacao;
		}
	
	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getCertificacao() {
		return certificacao;
	}

	public void setCertificacao(String certificacao) {
		this.certificacao = certificacao;
	}

	public int getQuantidadeBoia() {
		return quantidadeBoia;
	}

	public void setQuantidadeBoia(int quantidadeBoia) {
		this.quantidadeBoia = quantidadeBoia;
	}
}
