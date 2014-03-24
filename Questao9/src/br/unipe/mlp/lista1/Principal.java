package br.unipe.mlp.lista1;


import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args){

	Menu menu1 = new Menu();
	VeiculoDePasseio passeio = new VeiculoDePasseio();
	boolean condicao = true;
	
	double valorLocacao=0;
	double kmRodados;
	
	
	//while(condicao){
		
		
		switch (menu1.MenuPrincipal()) {
		
			case "1":
				int portas = Integer.parseInt(menu1.menuQtdPortas());
				int ar = Integer.parseInt(menu1.menuArCondicionado());
				double adicional = 50;

				passeio.setKmFinal(Integer.parseInt(JOptionPane.showInputDialog("Informe a kilometragem final:")));
				
				if((portas == 4) && ar == 1){
					valorLocacao = ((passeio.getKmFinal() - passeio.getKmInicial()) * passeio.getValorKmRodado()) + adicional;
					
							
				}else{
					
					JOptionPane.showMessageDialog(null, "Valores inválidos, tente novamente.....");
				}
				
				JOptionPane.showInternalMessageDialog(null, valorLocacao);	
				break;
				
			case "2":
				
		
			case "3":
				condicao = false;
			
		break;
				}
		}
	}
	
	
	
	
	


