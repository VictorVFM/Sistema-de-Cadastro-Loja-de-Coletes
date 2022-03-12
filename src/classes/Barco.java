package classes;

@SuppressWarnings("serial")
public class Barco extends Diversos {
	private String qntLugares, iluminacao, propulsao;
	private int quantidadeBarco;

	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Barco(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String qntLugares,
			String iluminacao, String propulsao, int quantidadeBarco) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.qntLugares = qntLugares;
		this.iluminacao = iluminacao;
		this.propulsao = propulsao;
		this.quantidadeBarco = quantidadeBarco;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeBarco +
				"\nGarantia: "+this.garantia +
				"\nCódigo: "+ this.codigo +
				"\nFabricante: " + this.fabricante +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nMarca: " + this.marca +
				"\nAno do Modelo: "+ this.anoModelo +
				"\nCor: "+ this.cor +
				"\nLocal de Origem: "+ this.localOrigem +
				"\nQuantidade de Lugares: " + this.qntLugares + 
				"\nIluminação: " + this.iluminacao + 
				"\nPropulsão: " + this.propulsao;
		}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getQntLugares() {
		return qntLugares;
	}

	public void setQntLugares(String qntLugares) {
		this.qntLugares = qntLugares;
	}

	public String getIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(String iluminacao) {
		this.iluminacao = iluminacao;
	}

	public String getPropulsao() {
		return propulsao;
	}

	public void setPropulsao(String propulsao) {
		this.propulsao = propulsao;
	}

	public int getQuantidadeBarco() {
		return quantidadeBarco;
	}

	public void setQuantidadeBarco(int quantidadeBarco) {
		this.quantidadeBarco = quantidadeBarco;
	}
}
