package br.unipe.mlp.lista1;

import Fitas.Fita;
import Fitas.FitaInfantil;
import Fitas.FitaLancamento;

public class Locadora {
	public static void main(String[] args) {
		Fita f1 = new FitaLancamento("teste1", 10);
		Fita f2 = new FitaInfantil("teste2", 11);

		System.out.println(f1.getPreco());
		System.out.println(f2.getPreco());
		
		
	}
}
