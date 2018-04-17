package FuncoesMatematicas;
import Calculadora.JanelaCalculadora;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Calculadora.JanelaCalculadora;

public class Funcoes  {

	
 double total;
 

	public double adicao(double a, double b) {
		 total = a + b;
		return total;
	}
	
	public double subtracao(double a, double b) {
		 total = a - b;
		return total;
	}
	
	public double multi(double a, double b) {
		 total = a * b;
		return total;
	}
	
	public double divisao(double a, double b) {
		 total = a / b;
		return total;
	}
	
	public double MaisouMenos(double a) {
		total = a*-1 ;
		return a;
	}
	
	public double raiz(double a) {
		 total = Math.sqrt(a);
		
		return total;
	}
	
	public double porcent(double a, double b) { 
		 total = (a * b)/100;
		return total;
	}
	
	public double fracao(double a) {
		 total = 1/a;
		return total;
		
	} 
		public double memo (double ms) {
			return ms;
		}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

