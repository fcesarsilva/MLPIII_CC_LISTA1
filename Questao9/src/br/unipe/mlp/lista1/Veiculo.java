package br.unipe.mlp.lista1;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;	
	private int ano;
	private double valorKmRodado=0.6;
	private int kmInicial=10000;
	private int kmFinal;
	private double valorDeLocacao;
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorDeLocacao() {
		return valorDeLocacao;
	}
	public double setValorDeLocacao(double valorDeLocacao) {
		return this.valorDeLocacao = valorDeLocacao;
	}

	
	public double CalcularValorLocacao(double valorDeLocacao){
		return setValorDeLocacao((kmInicial - kmFinal) * valorKmRodado);
	}
	

}
