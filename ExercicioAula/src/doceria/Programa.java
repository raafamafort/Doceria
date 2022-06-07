package doceria;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		// BEIJINHO 4 PARAMETROS COM CONSTRUTOR
		int recebeQuantidadeLeite = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Leite do Beijinho em ml: "));
		int recebeQuantidadeAcucar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Açucar do Beijinho em gramas: "));
		int recebeQuantidadeCoco = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Coco do Beijinho em gramas: "));
		String recebeApelidoDoce = JOptionPane.showInputDialog("Apelido do seu Beijinho: ");
		
		Beijinho bei = new Beijinho(recebeQuantidadeLeite, recebeQuantidadeAcucar, recebeQuantidadeCoco, recebeApelidoDoce);


		System.out.println(
				"Beijinho: \nQuantidade de Leite: " + bei.getQuantidadeLeite() + "ml\n" + "Quantidade de Açucar: "
						+ bei.getQuantidadeAcucar() + "g\n" + "Quantidade de Coco: " + bei.getQuantidadeCoco() + "g");
		bei.trocarLetra();
		bei.retornoPesoBeijinho();
		
		// BRIGADEIRO 4 PARAMETROS COM CONSTRUTOR
		int recebeQuantidadeLeiteB = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Leite do Brigadeiro em ml: "));
		int recebeQuantidadeAcucarB = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Açucar do Brigadeiro em gramas: "));
		int recebeQuantidadeChocolateB = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Coco do Brigadeiro em gramas: "));
		
		Brigadeiro bri = new Brigadeiro(recebeQuantidadeLeiteB, recebeQuantidadeAcucarB, recebeQuantidadeChocolateB);
		
		System.out.println("\nBrigadeiro: \nQuantidade de Leite: " + bri.getQuantidadeLeite() + "ml\n"
				+ "Quantidade de Açucar: " + bri.getQuantidadeAcucar() + "g\n" + "Quantidade de Chocolate: "
				+ bri.getQuantidadeChocolate() + "g");
		bri.retornoPesoBrigadeiro();

		
	}

}