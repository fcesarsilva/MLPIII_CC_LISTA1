package br.unipe.mlp1;

/* Flaviano Cezar e Diogo de Andrade
 * Questao 5 da Lista I - 1º Estagio
*/


import javax.swing.JOptionPane;

public class Programa {
	
	public static void main(String[] args) {
		
		FolhaDePagamento entrada = new FolhaDePagamento();
		
		String valor = JOptionPane.showInputDialog("Digite a sequencia: ");
		
		JOptionPane.showMessageDialog(null, "Valor de entrada: " + valor
				+ "\nResultado: " + entrada.dividirString(valor));
		
		
	}

}
