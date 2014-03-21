package br.unipe.mlp1;

/* Flaviano Cezar e Diogo de Andrade
 * Questao 5 da Lista I - 1º Estagio
 */

public class FolhaDePagamento {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma=0, soma2=0;
		String valor = "123abc123";
		String valor2 = "asd2675asjdajhsd1887asd565askmbmmvLOL900xD99";
		
		String[] resultado = valor.split("[a-zA-Z\\W]"); //Atribuindo a variavel resultado o metodo par dividir
														// a string em varias substring removendo as letras e somando os valores no final

			for(int i=0; i<resultado.length; i++){
				if(resultado[i].length()>0)
				soma = soma + Integer.parseInt(resultado[i]);// convertendo a variavel resultado de String para inteiro
			}
			
			System.out.println("valor1: " + valor);
			System.out.println("resultado:" + soma);
			System.out.println();
			
			resultado = valor2.split("[a-zA-Z\\W]");
			
			for(int i=0; i<resultado.length; i++){
				if(resultado[i].length()>0)
					soma2 = soma2 + Integer.parseInt(resultado[i]);
				
				}
				
			System.out.println("valor2: " + valor2);
			System.out.println("resultado:" + soma2);
			
		}
			
	}


