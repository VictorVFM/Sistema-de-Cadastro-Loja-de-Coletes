package classes;

@SuppressWarnings("serial")
public class Faca extends Diversos {
	private String tamanho, tipoFio, tipoLamina;
	private int quantidadeFaca;
	
	/*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Faca(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String tamanho, String tipoFio,
			String tipoLamina, int quantidadeFaca) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.tamanho = tamanho;
		this.tipoFio = tipoFio;
		this.tipoLamina = tipoLamina;
		this.quantidadeFaca = quantidadeFaca;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeFaca +
				"\nGarantia: "+this.garantia +
				"\nCódigo: "+ this.codigo +
				"\nFabricante: " + this.fabricante +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nMarca: " + this.marca +
				"\nAno do Modelo: "+ this.anoModelo +
				"\nCor: "+ this.cor +
				"\nLocal de Origem: "+ this.localOrigem +
				"\nTamanho: " + this.tamanho +  
				"\nTipo de Fio: " + this.tipoFio + 
				"\nTipo de Lâmina: " + this.tipoLamina;
		}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoFio() {
		return tipoFio;
	}

	public void setTipoFio(String tipoFio) {
		this.tipoFio = tipoFio;
	}

	public String getTipoLamina() {
		return tipoLamina;
	}

	public void setTipoLamina(String tipoLamina) {
		this.tipoLamina = tipoLamina;
	}

	public int getQuantidadeFaca() {
		return quantidadeFaca;
	}

	public void setQuantidadeFaca(int quantidadeFaca) {
		this.quantidadeFaca = quantidadeFaca;
	}
}
