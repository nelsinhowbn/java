package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aula1805 {
	
	public void inserir(String texto) throws IOException {
		//Grava��o
		 FileWriter arq = new FileWriter("d:\\teste.txt", true); // este True permite que voce continue escrevendo seu arquivo
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	

	
	
	public void leitura(String texto) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conte�do: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	
	
	/*public void atualizar(String texto) throws IOException {
		//atualizar
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String TextOld = lerArq.readLine(); 
	     int i = 0;
	     
	     while (TextOld != null) {
	    	 i=3;
	    	 if(TextOld.contains(texto)) {
	    		TextOld += ("Jo�o"); 
	    	 } }
	    	
	     }*/
	
	public static void main(String args[]) throws Exception {
		Aula1805 arq = new Aula1805();
		//arq.inserir("Jeferson");
	    arq.leitura("Jo�o");
		 arq.leitura("Nelson");
		
	
	}






}


