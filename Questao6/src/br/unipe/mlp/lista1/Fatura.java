package br.unipe.mlp.lista1;

public class Fatura {
	private String id;
	private String descricao;
	private int quantidadeComprada;
	private double preco;
	
	
	public Fatura(String id, String descricao, int quantidadeComprada,
			double preco) {
		
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.preco = preco;
		
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		if(quantidadeComprada < 0){
			this.quantidadeComprada = 0;
		}
		else {
				this.quantidadeComprada = quantidadeComprada;
				
			 }
		}
		

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco < 0){
			this.preco = 0;
		}
		else {
			
			this.preco = preco;
			
		     }
		
	}
	
	public double getValorFatura(){
		return quantidadeComprada*preco;
		
		}
}
