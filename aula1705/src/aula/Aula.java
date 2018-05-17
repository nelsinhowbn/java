package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Aula { // throws serve para mostrar os erros para voce no caso de nao conseguir criar o Arquivo
	
	public static void main(String args[]) throws Exception {
		
		
		/* FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 1; i < 100; i++) { // Vai começar no número 1 e parar quando for menor que 100===99
			 gravarArq.println("valor de i: " + i ); 
		 }
		 arq.close();*/
	
	       //Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	  int    i=0;
	     while (linha != null) { // caso a linha for diferente de nula, ou seja zerada ele vai monstrar pra voce e vai parar quando for nula, ou seja na ultima
	    	 i++;
	    	 if(linha.contains("teste")) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	
	
	}
	
	
	
	
}
