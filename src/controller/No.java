package controller;

public class No {
	
		 // conteúdo a ser armazenado no nó
		 private int elem;
		 
		 // declaracao dos nós da esquerda e direita da árvore
		 private No esq, dir;

		 public No(int elem){
		 
			 //construtor da classe - inicializa o nó
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
