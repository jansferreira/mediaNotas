package program;

import javax.swing.JOptionPane;

public class Media {
	
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4: ");
		
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null,"A media das notas é: " + media 
												+ " Você está aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "A media das notas é: " + media 
												+" Você está reprovado!");
		}
	}
}