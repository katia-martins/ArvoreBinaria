package controller;

public class No {
	
		 // conte�do a ser armazenado no n�
		 private int elem;
		 
		 // declaracao dos n�s da esquerda e direita da �rvore
		 private No esq, dir;

		 public No(int elem){
		 
			 //construtor da classe - inicializa o n�
			 setElem(elem);
			 esq = null;
			 dir = null;
		 }
		 
		 public void setElem(int elem){
			 this.elem = elem;
		 }
		 
		 public void setEsq(No esq){
			 this.esq = esq;
		 }

		 public void setDir(No dir){
			 this.dir = dir;
		 }
			 
		 public int getElem(){
			 return this.elem;
		 }
		 
		 public No getEsq(){
			 return this.esq;
		 }
		 
		 public No getDir(){
			 return this.dir;
		 } 

}
