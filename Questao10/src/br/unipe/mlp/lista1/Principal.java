package br.unipe.mlp.lista1;

public class Principal {

	public static void main(String[] args) {
		
	
	FiguraGeometrica circulo = new Circulo();
	FiguraGeometrica quadrado = new Quadrado();
	FiguraGeometrica triangulo = new Triangulo();
	
	Lapis c = new Lapis(circulo);
	Lapis q = new Lapis(quadrado);
	Lapis t = new Lapis(triangulo);
	
	c.acao();
	q.acao();
	t.acao();
	}
}
