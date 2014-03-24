package br.unipe.mlp.lista1;

import javax.swing.JOptionPane;


public class Menu {
		
	public String MenuPrincipal(){
		
		return JOptionPane.showInputDialog("Informe o tipo de Veiculo que precisas: \n"
				+ "1. Veiculo de Passeio.\n"
				+ "2. Veiculo de Carga.\n"
				+ "3. Sair.");	
	}

	public String menuQtdPortas(){
		
		return JOptionPane.showInputDialog("Informe a quantidade de portas: ");
	}

	public String menuArCondicionado(){
		
		return JOptionPane.showInputDialog("Ar condicionado?\n" + " 1. SIM\n" + " 2. NAO");
		
}
}