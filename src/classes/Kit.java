package classes;

@SuppressWarnings("serial")
public class Kit extends Diversos {
	
	private String facilidadeManuseio, tamanho, comidaEmergencia;
	private int quantidadeKit;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Kit(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String facilidadeManuseio,
			String tamanho, String comidaEmergencia, int quantidadeKit) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.facilidadeManuseio = facilidadeManuseio;
		this.tamanho = tamanho;
		this.comidaEmergencia = comidaEmergencia;
		this.quantidadeKit = quantidadeKit;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeKit +
				"\nGarantia: "+this.garantia +
				"\nCódigo: "+ this.codigo +
				"\nFabricante: " + this.fabricante +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nMarca: " + this.marca +
				"\nAno do Modelo: "+ this.anoModelo +
				"\nCor: "+ this.cor +
				"\nLocal de Origem: "+ this.localOrigem +
				"\nTamanho: " + this.tamanho + 
				"\nFacilidade de Manuseio: " + this.facilidadeManuseio + 
				"\nCom Comida de Emergência: " + this.comidaEmergencia;
		}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getFacilidadeManuseio() {
		return facilidadeManuseio;
	}

	public void setFacilidadeManuseio(String facilidadeManuseio) {
		this.facilidadeManuseio = facilidadeManuseio;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getComidaEmergencia() {
		return comidaEmergencia;
	}

	public void setComidaEmergencia(String comidaEmergencia) {
		this.comidaEmergencia = comidaEmergencia;
	}

	public int getQuantidadeKit() {
		return quantidadeKit;
	}

	public void setQuantidadeKit(int quantidadeKit) {
		this.quantidadeKit = quantidadeKit;
	}
}
