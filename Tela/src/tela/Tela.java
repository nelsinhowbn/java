package tela;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Tela extends JFrame{
	JTextArea txtTexto = new JTextArea("Escreva o seu Texto...",15,30);
	JScrollPane barra = new JScrollPane(txtTexto);
	JLabel lblTitulo = new JLabel("O que não funciona?");
	
	JCheckBox chkOpcao01;
    JCheckBox chkOpcao02;
    JCheckBox chkOpcao03;
	
    
    ButtonGroup grupoSexo = new ButtonGroup();
	JRadioButton[] sexo = new JRadioButton[2];
	
	JLabel lblSexo = new JLabel("Selecione o sexo desejado:");
    public Tela() {
			super("Tela");
	        Container pane = this.getContentPane();
			pane.setLayout(null);
			barra.setHorizontalScrollBarPolicy(
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

			barra.setVerticalScrollBarPolicy(
					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			
			barra.setBounds(20, 20, 360, 150);
			pane.add(barra);
			lblTitulo.setBounds(20, 180, 200, 20);
			pane.add(lblTitulo);
			
			
			
			chkOpcao01 = new JCheckBox("Java");
			chkOpcao01.setBounds(20, 200, 100, 20);
			pane.add(chkOpcao01);
			chkOpcao02 = new JCheckBox("Windows");
			chkOpcao02.setBounds(20, 220, 100, 20);
			pane.add(chkOpcao02);
			chkOpcao03 = new JCheckBox("C#");
			chkOpcao03.setBounds(20, 240, 100, 20);
			pane.add(chkOpcao03);
			
		    
			
			

			lblSexo.setBounds(20, 280, 200, 20);
			pane.add(lblSexo);
			
			sexo[0] = new JRadioButton("Masculino");
			sexo[0].setBounds(20, 300, 100, 20);
			
			sexo[1] = new JRadioButton("Feminino");
			sexo[1].setBounds(20, 320, 100, 20);
			
			for (int i = 0; i < sexo.length; i++){
				grupoSexo.add(sexo[i]);
				pane.add(sexo[i]);
			
			}
			
			
			
			
			
			
			this.setSize(400, 500);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   }
	
	   public static void main(String args[]) {
			Tela tel = new Tela();
	   }	

}
