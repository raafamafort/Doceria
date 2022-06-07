package doceria;

public class Doce {

	Doce() {

	}
	
	Doce(int recebeQuantidadeLeite, int recebeQuantidadeAcucar){
		this.setQuantidadeLeite(recebeQuantidadeLeite);
		this.setQuantidadeAcucar(recebeQuantidadeAcucar);
	}

	private int quantidadeLeite;
	private int quantidadeAcucar;

	public int getQuantidadeLeite() {
		return quantidadeLeite;
	}

	public void setQuantidadeLeite(int quantidadeLeite) {
		this.quantidadeLeite = quantidadeLeite;
	}

	public int getQuantidadeAcucar() {
		return quantidadeAcucar;
	}

	public void setQuantidadeAcucar(int quantidadeAcucar) {
		this.quantidadeAcucar = quantidadeAcucar;
	}

}