package br.unipe.mlp1;


public class FolhaDePagamento {
	
	public int dividirString(String valor){
		
		String[] resultado=valor.split("[a-zA-Z\\W]");//cria um vetor de string com a separacao de caracter e numero de valor
		int soma = 0;
		
		for(int i=0; i<resultado.length; i++){ //percorrendo o vetor de string criado com o metodo split
			if(resultado[i].length()>0)
			soma = soma + Integer.parseInt(resultado[i]);// convertendo a variavel resultado de String para inteiro para efetuar a soma
		}
			
		return soma;		
	}
}