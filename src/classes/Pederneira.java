package classes;

@SuppressWarnings("serial")
public class Pederneira extends Diversos {
	private String peso, tamanho, possuiCorrente;
	private int quantidadePederneira;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Pederneira(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String peso, String tamanho,
			String possuiCorrente, int quantidadePederneira) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.peso = peso;
		this.tamanho = tamanho;
		this.possuiCorrente = possuiCorrente;
		this.quantidadePederneira = quantidadePederneira;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadePederneira +
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
				"\nCom Correntes: " + this.possuiCorrente;
		}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getPossuiCorrente() {
		return possuiCorrente;
	}

	public void setPossuiCorrente(String possuiCorrente) {
		this.possuiCorrente = possuiCorrente;
	}

	public int getQuantidadePederneira() {
		return quantidadePederneira;
	}

	public void setQuantidadePederneira(int quantidadePederneira) {
		this.quantidadePederneira = quantidadePederneira;
	}
}
