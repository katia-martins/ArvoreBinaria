package controller;

public class ArvoreBinaria {
	
	 // raiz da �rvore
	 private No raiz;
	 
	 // construtor da classe
	 public ArvoreBinaria(){
		 raiz = null;
	 }

	 public boolean arvoreVazia(){
		 return(raiz == null);
	 }
	 
	 
	 public No getRaiz(){
		 return raiz;
	 }

	 public No criaRaiz(int valor){
		 
		 No novoNo = new No(valor);
		 raiz = novoNo;
		 return novoNo;
	 }
	 
	 public No insereEsq(No pai, int valor){
		 
		 if (!arvoreVazia()) { //verifica se a arvore nao eh vazia
			 
			 if (pai.getEsq() != null){ //se o no pai a esquerda eh diferente de nulo
				 
				 System.out.println("\n N� esquerdo j� ocupado!!! \n");
				 return null;
			 }
			 else {
				 No novoNo = new No(valor);
				 pai.setEsq(novoNo); //no pai a esquerda recebe o novo no
				 return(novoNo);
			 }
		 }
		 return null;
	} 

	 public No insereDir(No pai, int valor){
		 
		 if (!arvoreVazia()) {
		 
			 if (pai.getDir() != null){
				 System.out.println("\n N� direito j� ocupado!!! \n");
				 return null;
			 }
			 else {
				 No novoNo = new No(valor);
				 pai.setDir(novoNo);
				 return(novoNo);
			 }
		 }
	 	 	return null;
	 } 
	 
	public void percurso_preordem(){
		 preordem(raiz);
	}
	
	private void preordem(No r){
		/*O percurso pr�-ordem consiste nos seguintes passos:
			1. Mostra o valor do n�;
			2. Visita o n� esquerdo;
			3. Visita o n� direito;*/
		
		if (r != null) {
			System.out.print(r.getElem() + ", ");
			preordem(r.getEsq());
			preordem(r.getDir());
		}
	}
		
	public void percurso_emordem(){
		emordem(raiz);
	}
	
	private void emordem(No r){
		/*O percurso em-ordem consiste nos seguintes passos:
			1. Visita o n� esquerdo;
			2. Mostra o valor do n�;
			3. Visita o n� direito; */
		
		if (r != null) {
			emordem(r.getEsq());
			System.out.print(r.getElem() + ", ");
			emordem(r.getDir());
		}
	}
			
	public void percurso_posordem(){
		posordem(raiz);
	}
	
	private void posordem(No r){
		/*O percurso p�s-ordem consiste nos seguintes passos:
			1. Visita o n� esquerdo;
			2. Mostra o valor do n�;
			3. Visita o n� direito;*/
		
		if (r != null) {
			posordem(r.getEsq());
			posordem(r.getDir());
			System.out.print(r.getElem() + ", ");
		}
	}

}
