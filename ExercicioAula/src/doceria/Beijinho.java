package doceria;

public class Beijinho extends Doce {

	Beijinho() {

	}

	Beijinho(int recebeQuantidadeLeite, int recebeQuantidadeAcucar,int recebeQuantidadeCoco, String recebeApelidoDoce) {
		super(recebeQuantidadeLeite, recebeQuantidadeAcucar);
		this.setQuantidadeCoco(recebeQuantidadeCoco);
		this.setApelidoDoce(recebeApelidoDoce);
	}

	private int quantidadeCoco;
	private String apelidoDoce;

	public String getApelidoDoce() {
		return apelidoDoce;
	}

	public void setApelidoDoce(String apelidoDoce) {
		this.apelidoDoce = apelidoDoce;
	}

	public int getQuantidadeCoco() {
		return quantidadeCoco;
	}

	public void setQuantidadeCoco(int quantidadeCoco) {
		this.quantidadeCoco = quantidadeCoco;
	}

	void retornoPesoBeijinho() {
		int pesoTotal = this.getQuantidadeAcucar() + this.getQuantidadeCoco();
		System.out.println("O peso total em grama do seu beijinho é: " + pesoTotal);
	}

	void trocarLetra() {
		System.out.println("Apelido do beijinho: " + this.getApelidoDoce().replace("a", "@"));
	}

}