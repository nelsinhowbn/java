package Calculadora;



import java.awt.Container;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import FuncoesMatematicas.Funcoes;
public class JanelaCalculadora extends JFrame{
	
	JTextField txtVisor = new JTextField("0");
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
    JButton btnSeta = new JButton("<-");
    JButton btnCe = new JButton("CE");
    JButton btnC = new JButton("C");
    JButton btnMaisoumenos = new JButton("+-");
    JButton btnRaiz = new JButton("Raiz");
    JButton btnSete = new JButton("7");
    JButton btnOito = new JButton("8");
    JButton btnNove = new JButton("9");
    JButton btnBarra = new JButton("/");
    JButton btnPorcent = new JButton("%");
    JButton btnQuatro = new JButton("4");
    JButton btnCinco = new JButton("5");
    JButton btnSeis = new JButton("6");
    JButton btnMult = new JButton("*");
    JButton btnUmx = new JButton("1/x");
    JButton btnUm = new JButton("1");
    JButton btnDois = new JButton("2");
    JButton btnTres = new JButton("3");
    JButton btnMenoss = new JButton("-");
    JButton btnIgual = new JButton("=");
    JButton btnZero = new JButton("0");
    JButton btnVirg = new JButton(",");
    JButton btnMaiss = new JButton("+");
    
   String sinal;
    double a, b, ms=0;
    
   Funcoes calc = new Funcoes();
	
    
    
    
    
    public JanelaCalculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(20, 20, 172, 55);
		paine.add(txtVisor);
		
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setBounds(20, 80, 30, 25);
		paine.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
					
					ms = 0;
					
					
			    }
				
			});
			    
		
		
		
		
		
		
		
		
		
		
		
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setBounds(55, 80, 30, 25);
	    paine.add(btnMR);
	    btnMR.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				
					txtVisor.setText(ms + "");
				
				
		    }
			
		});
		    
	    
	    
	    
	    
	    
	    
	    
	    btnMS.setMargin(new Insets(1,1,1,1));
	    btnMS.setBounds(90, 80, 30, 25);
	    paine.add(btnMS);
	    btnMS.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				
					ms = Double.parseDouble(txtVisor.getText());
				
				
		    }
			
		});
		    
	    
	    
	    
	    
	    btnMais.setMargin(new Insets(1,1,1,1));
	    btnMais.setBounds(125, 80, 30, 25);
	    paine.add(btnMais);
	    btnMais.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)  {
	   ms += Double.parseDouble(txtVisor.getText() );
	    	}
	    	
	    });
	    	
	    	
	    	
	    	
	    	
	    
	    
	    btnMenos.setMargin(new Insets(1,1,1,1));
	    btnMenos.setBounds(160, 80, 30, 25);
	    paine.add(btnMenos);
	    btnMenos.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)  {
	   ms -= Double.parseDouble(txtVisor.getText() );
	    	}
	    	
	    });
	    	
	    
	    
	    
	    
		
	    
	    btnSeta.setMargin(new Insets(1,1,1,1));
	    btnSeta.setBounds(20, 110, 30, 25);
	    paine.add(btnSeta);
	    btnCe.setMargin(new Insets(1,1,1,1));
	    btnCe.setBounds(55, 110, 30, 25);
	    paine.add(btnCe);
		
	    btnCe.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
			
				txtVisor.setText("0");
			
			
	    }
		
	});
	    
	    btnC.setMargin(new Insets(1,1,1,1));
	    btnC.setBounds(90, 110, 30, 25);
	    paine.add(btnC);
	    btnC.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				
					txtVisor.setText("0");
				
				
		    }
			
		});
		    
	    
	    
	    
	    btnMaisoumenos.setMargin(new Insets(1,1,1,1));
	    btnMaisoumenos.setBounds(125, 110, 30, 25);
	    paine.add(btnMaisoumenos);
	    btnMaisoumenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				
				txtVisor.setText(calc.MaisouMenos(a) + "");
				
			}
		});
	    
	    
	    
	    btnRaiz.setMargin(new Insets(1,1,1,1));
	    btnRaiz.setBounds(160, 110, 30, 25);
	    paine.add(btnRaiz);
	    btnRaiz.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(txtVisor.getText());
			
			txtVisor.setText(calc.raiz(a) + "");
			
		}
	});
	    
	    
	    
	    
	    
	    
	    btnSete.setMargin(new Insets(1,1,1,1));
	    btnSete.setBounds(20, 140, 30, 25);
	    paine.add(btnSete);
	     btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}else {
					txtVisor.setText(txtVisor.getText()+ "7");
				}
				
				
			}
		});
	     btnOito.setMargin(new Insets(1,1,1,1));
	    btnOito.setBounds(55, 140, 30, 25);
	    paine.add(btnOito);
	    btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}else {
					txtVisor.setText(txtVisor.getText()+ "8");
				}
				
				
			}
		});
	    btnNove.setMargin(new Insets(1,1,1,1));
	    btnNove.setBounds(90, 140, 30, 25);
	    paine.add(btnNove);
	    btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("7");
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}else {
					txtVisor.setText(txtVisor.getText()+ "9");
				}
				
				
			}
		});
	    
	    
	    btnBarra.setMargin(new Insets(1,1,1,1));
	    btnBarra.setBounds(125, 140, 30, 25);
	    paine.add(btnBarra);
	    btnBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				sinal = "Divisão";
				txtVisor.setText("0");
				
			}
		});
	    
	    
	    
	    
	    btnPorcent.setMargin(new Insets(1,1,1,1));
	    btnPorcent.setBounds(160, 140, 30, 25);
	    paine.add(btnPorcent);
	    btnPorcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				sinal = "Subtração";
				txtVisor.setText("0");
				
			}
		});
	    
	    
	    
	    
	    btnQuatro.setMargin(new Insets(1,1,1,1));
	    btnQuatro.setBounds(20, 170, 30, 25);
	    paine.add(btnQuatro);
	    btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}else {
					txtVisor.setText(txtVisor.getText()+ "4");
				}
			}
			}
	    
	    
			);
	    
	    btnCinco.setMargin(new Insets(1,1,1,1));
	    btnCinco.setBounds(55, 170, 30, 25);
	    paine.add(btnCinco);
	    btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}else {
					txtVisor.setText(txtVisor.getText()+ "5");
				}
			}
			}
	    
	    
			);
	    btnSeis.setMargin(new Insets(1,1,1,1));
	    btnSeis.setBounds(90, 170, 30, 25);
	    paine.add(btnSeis);
	    btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}else {
					txtVisor.setText(txtVisor.getText()+ "6");
				}
			}
			}
	    
	    
			);
	    btnMult.setMargin(new Insets(1,1,1,1));
	    btnMult.setBounds(125, 170, 30, 25);
	    paine.add(btnMult);
	    btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				sinal = "Multiplicação";
				txtVisor.setText("0");
				
			}
		});
	    btnUmx.setMargin(new Insets(1,1,1,1));
	    btnUmx.setBounds(160, 170, 30, 25);
	    paine.add(btnUmx);
	    
	    btnUm.setMargin(new Insets(1,1,1,1));
	    btnUm.setBounds(20, 200, 30, 25);
	    paine.add(btnUm);
	    btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}else {
					txtVisor.setText(txtVisor.getText()+ "1");
				}
			}
			}
	    
	    
			);
	    btnDois.setMargin(new Insets(1,1,1,1));
	    btnDois.setBounds(55, 200, 30, 25);
	    paine.add(btnDois);
	    btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}else {
					txtVisor.setText(txtVisor.getText()+ "2");
				}
			}
			}
	    
	    
			);
	    btnTres.setMargin(new Insets(1,1,1,1));
	    btnTres.setBounds(90, 200, 30, 25);
	    paine.add(btnTres);
	    btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}else {
					txtVisor.setText(txtVisor.getText()+ "3");
				}
			}
			}
	    
	    
			);
	    btnMenoss.setMargin(new Insets(1,1,1,1));
	    btnMenoss.setBounds(125, 200, 30, 25);
	    paine.add(btnMenoss);
	    btnMenoss.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a = Double.parseDouble(txtVisor.getText());
					sinal = "Subtração";
					txtVisor.setText("0");
					
				}
			});
	    
	    btnIgual.setMargin(new Insets(1,1,1,1));
	    btnIgual.setBounds(160, 200, 30, 55);
	    paine.add(btnIgual);
	    btnIgual.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (sinal.equals("Subtração")) {
	    			b = Double.parseDouble(txtVisor.getText());
	    			txtVisor.setText(calc.subtracao(a,b)+"");
	    		}
	    		else if (sinal.equals("Adição")) {
	    			b = Double.parseDouble(txtVisor.getText());
	    			txtVisor.setText(calc.adicao(a,b)+"");
	    		}
	    		else if (sinal.equals("Multiplicação")){
	    		   b = Double.parseDouble(txtVisor.getText());
	    		   txtVisor.setText(calc.multi(a,b)+"");
	    		}
	    		else if (sinal.equals("Porcentagem")) {
	    			b = Double.parseDouble(txtVisor.getText());
	    			txtVisor.setText(calc.porcent(a,b)+"");
	    		}
	    		
	    		else if (sinal.equals("Divisão")) {
	    			b = Double.parseDouble(txtVisor.getText());
	    			txtVisor.setText(calc.divisao(a,b)+"");
	    		}
	    		
	    		
	    		
	    		
	    		
	    	}
	    });
	    
	   
	    btnZero.setMargin(new Insets(1,1,1,1));
	    btnZero.setBounds(20, 230, 65, 25);
	    paine.add(btnZero);
	    
	    btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}else {
					txtVisor.setText(txtVisor.getText()+ "0");
				}
				
				
			}
		});
	    btnVirg.setMargin(new Insets(1,1,1,1));
	    btnVirg.setBounds(90, 230, 30, 25);
	    paine.add(btnVirg);
	    btnVirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!txtVisor.getText().contains(".")) {
					txtVisor.setText(txtVisor.getText()+ ".");
				}else {
					
				}
				
				
			}
		});
	    btnMaiss.setMargin(new Insets(1,1,1,1));
	    btnMaiss.setBounds(125, 230, 30, 25);
	    paine.add(btnMaiss);
	    btnMaiss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(txtVisor.getText());
				sinal = "Adição";
				txtVisor.setText("0");
				
			}
		});
	    
	    
	    
		
		
	  
	    this.setSize(210, 305);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	public static void main(String args[]) {
		JanelaCalculadora calc = new JanelaCalculadora();
	}


//Não coloquei fonte porque não gostei 















}
