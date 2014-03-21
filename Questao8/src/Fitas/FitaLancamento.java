package Fitas;

public class FitaLancamento extends Fita {

	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return (super.getPreco()+(super.getPreco()*20/100));
	}

}
