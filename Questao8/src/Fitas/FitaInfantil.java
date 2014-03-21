package Fitas;

public class FitaInfantil extends Fita {

	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return (super.getPreco() - (super.getPreco() * 40/100));
	}
	
	
	

}
