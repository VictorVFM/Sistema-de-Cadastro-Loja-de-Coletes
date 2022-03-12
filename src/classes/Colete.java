package classes;

@SuppressWarnings("serial")
public class Colete extends Produtos {
	private String tamanho, peso, certificacao;
	private int quantidadeColete;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Colete(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String tamanho, String peso,
			String certificacao, int quantidadeColete) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.tamanho = tamanho;
		this.peso = peso;
		this.certificacao = certificacao;
		this.quantidadeColete = quantidadeColete;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeColete +
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

	public int getQuantidadeColete() {
		return quantidadeColete;
	}

	public void setQuantidadeColete(int quantidadeColete) {
		this.quantidadeColete = quantidadeColete;
	}
}
