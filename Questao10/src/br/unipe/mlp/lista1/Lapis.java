package br.unipe.mlp.lista1;

public class Lapis {

	private FiguraGeometrica figuraGeometrica;

	public Lapis(FiguraGeometrica nFiguraGeometrica){
		this.figuraGeometrica = nFiguraGeometrica;
	}
	
	public void acao(){
		this.figuraGeometrica.desenhar();
	}

	/**
	 * @return the figuraGeometrica
	 */
	public FiguraGeometrica getFiguraGeometrica() {
		return figuraGeometrica;
	}

	/**
	 * @param figuraGeometrica the figuraGeometrica to set
	 */
	public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
		this.figuraGeometrica = figuraGeometrica;
	}
	
	

}
