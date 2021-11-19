package view;

import controller.ArvoreBinaria;
import controller.No;

public class Principal {

	public static void main(String args[]){

		ArvoreBinaria arvore;
		No no;

		arvore = new ArvoreBinaria();
		
		no = arvore.criaRaiz(6);
		arvore.insereDir(no,14);
		no = arvore.insereEsq(no,19);
		arvore.insereEsq(no,3);
		no = arvore.insereDir(no,8);
		arvore.insereEsq(no,7);
		arvore.insereDir(no,9);

		
		 System.out.println("\nPercurso Pré-Ordem");
		 arvore.percurso_preordem();
		 
		 System.out.println("\nPercurso Em-Ordem");
		 arvore.percurso_emordem();
		 
		 System.out.println("\nPercurso Pós-Ordem");
		 arvore.percurso_posordem();
		 } 

}
