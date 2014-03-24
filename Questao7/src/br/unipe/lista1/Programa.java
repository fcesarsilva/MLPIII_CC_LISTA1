
package br.unipe.lista1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {

	
    public static void main (String[]args){

    Pessoa contato = new Pessoa();
    Scanner entrada = new Scanner(System.in);

    int i = 0;
    
    while (i != 6){
    	
	    System.out.println("------------MENU AGENDA----------");
	    System.out.println("1. Adicionar Contato");
	    System.out.println("2. Procurar contato");
	    System.out.println("3. Editar contato");
	    System.out.println("4. Listar contatos:");
	    System.out.println("5. Remover contato");

    int opcao = Integer.parseInt(entrada.nextLine());

    switch(opcao){

    case 1:
    	Pessoa novoContato = new Pessoa();
    	
    	System.out.println("Adicionar contato...\n");
    	System.out.println("Nome:");
    	novoContato.nome = entrada.nextLine();
    	
    	System.out.println("Telefone:");
    	novoContato.telefone = Long.parseLong(entrada.nextLine());

    	break;    

    case 2:
    	
    
    case 4:
    	for ( int z = 0; z < 10; z ++) {
    		System.out.println ();
    	}
    	break;    

    case 6:

        System.out.println ("Saindo...");

    break;    

    default:
        System.out.println("Opçao Incorreta! Tente Novamente.");
    break;
    }    
    }

   }
	
	
}
