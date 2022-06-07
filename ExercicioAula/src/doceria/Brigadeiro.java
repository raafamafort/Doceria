package doceria;

public class Brigadeiro extends Doce {

	private int quantidadeChocolate;

	Brigadeiro() {

	}

	Brigadeiro(int recebeQuantidadeLeite, int recebeQuantidadeAcucar,int recebeQuantidadeChocolate) {
		super(recebeQuantidadeLeite, recebeQuantidadeAcucar);
		this.setQuantidadeChocolate(recebeQuantidadeChocolate);
	}

	public int getQuantidadeChocolate() {
		return quantidadeChocolate;
	}

	public void setQuantidadeChocolate(int quantidadeChocolate) {
		this.quantidadeChocolate = quantidadeChocolate;
	}

	void retornoPesoBrigadeiro() {
		int pesoTotal = this.getQuantidadeAcucar() + this.getQuantidadeChocolate();
		System.out.println("\nO peso total em grama do seu brigadeiro é: " + pesoTotal);
	}
}