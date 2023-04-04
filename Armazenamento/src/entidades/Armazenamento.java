package entidades;

public class Armazenamento {
	private String tipoArmazenamento;
	private float quantidadeGB;
	private float memoriaOcupada;
	
	

	//Construtores
	public Armazenamento(){
	}
	
	public Armazenamento(String tipoArmazenamento, float quantidadeGB) {
		this.tipoArmazenamento = tipoArmazenamento;
		this.quantidadeGB = quantidadeGB;
	}
	
	//Getters e Setters
	public String getTipoArmazenamento() {
		return tipoArmazenamento;
	}

	public void setTipoArmazenamento(String tipoArmazenamento) {
		this.tipoArmazenamento = tipoArmazenamento;
	}

	public float getQuantidadeGB() {
		return quantidadeGB;
	}

	public void setQuantidadeGB(float quantidadeGB) {
		this.quantidadeGB = quantidadeGB;
	}
	public float getMemoriaOcupada() {
		return memoriaOcupada;
	}

	public void setMemoriaOcupada(float memoriaOcupada) {
		this.memoriaOcupada = memoriaOcupada;
	}
}
