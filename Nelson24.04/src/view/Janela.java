package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField();
	JLabel lblRG = new JLabel("R.G: ");
	JTextField txtrg = new JTextField();
	JLabel lblTel = new JLabel("Telefone: ");
	JTextField txtTel = new JTextField();
	JLabel lblEmail = new JLabel("E- mail: ");
	JTextField txtEmail = new JTextField();
	JLabel lblCel = new JLabel("Celular: ");
	JTextField txtCel = new JTextField();
	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtcpf = new JTextField();
	
	public Janela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(10, 2));
		
		pane.add(lblNome);
	    pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblRG);
		pane.add(txtrg);
		pane.add(lblCpf);
		pane.add(txtcpf);
		pane.add(lblTel);
		pane.add(txtTel);
		pane.add(lblEmail);
		pane.add(txtEmail);
		pane.add(lblCel);
		pane.add(txtCel);
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela janela = new Janela();
	}

}
