package classes;

@SuppressWarnings("serial")
public class Lanterna extends Diversos {
    private String tamanho, tipoEnergia, intensidadeLuz;
    private int quantidadeLanterna;

    /*------------------------------------------------CONSTRUTOR------------------------------------------------*/
	public Lanterna(float preco, int garantia, String codigo, String fabricante, String marca, String localOrigem,
			String cor, String anoModelo, String anoFabricacao, String tipoProduto, String tamanho, String tipoEnergia,
			String intensidadeLuz, int quantidadeLanterna) {
		super(preco, garantia, codigo, fabricante, marca, localOrigem, cor, anoModelo, anoFabricacao, tipoProduto);
		this.tamanho = tamanho;
		this.tipoEnergia = tipoEnergia;
		this.intensidadeLuz = intensidadeLuz;
		this.quantidadeLanterna = quantidadeLanterna;
	}

	/*------------------------------------------------MÉTODO MOSTRAR DADOS------------------------------------------------*/
	public String mostrarDados() {
		return  "\n" + "\nTipo Produto: "+ this.tipoProduto +
				"\nPreço: "+ this.preco +
				"\nQuantidade: "+ this.quantidadeLanterna +
				"\nGarantia: "+this.garantia +
				"\nCódigo: "+ this.codigo +
				"\nFabricante: " + this.fabricante +
				"\nAno Fabricação: "+ this.anoFabricacao +
				"\nMarca: " + this.marca +
				"\nAno do Modelo: "+ this.anoModelo +
				"\nCor: "+ this.cor +
				"\nLocal de Origem: "+ this.localOrigem +
				"\nTamanho: " + this.tamanho + 
				"\nTipo de Energia: " + this.tipoEnergia + 
				"\nIntensidade da Luz: " + this.intensidadeLuz;
		}

	/*------------------------------------------------GETTERS E SETTERS------------------------------------------------*/
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoEnergia() {
		return tipoEnergia;
	}

	public void setTipoEnergia(String tipoEnergia) {
		this.tipoEnergia = tipoEnergia;
	}

	public String getIntensidadeLuz() {
		return intensidadeLuz;
	}

	public void setIntensidadeLuz(String intensidadeLuz) {
		this.intensidadeLuz = intensidadeLuz;
	}

	public int getQuantidadeLanterna() {
		return quantidadeLanterna;
	}

	public void setQuantidadeLanterna(int quantidadeLanterna) {
		this.quantidadeLanterna = quantidadeLanterna;
	}
}
