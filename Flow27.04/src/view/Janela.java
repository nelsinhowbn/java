package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(45);
	JLabel lblEndereco = new JLabel("Endereco: ");
	JTextField txtEndereco = new JTextField(45);
	JLabel lblRG = new JLabel("R.G: ");
	JTextField txtrg = new JTextField(45);
	JLabel lblTel = new JLabel("Telefone: ");
	JTextField txtTel = new JTextField(45);
	JLabel lblEmail = new JLabel("E- mail: ");
	JTextField txtEmail = new JTextField(45);
	JLabel lblCel = new JLabel("Celular: ");
	JTextField txtCel = new JTextField(45);
	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtcpf = new JTextField(45);
	
	public Janela() {
		super("Janela com Novo Layout");
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		pane.add(lblNome);
		pane.add(txtNome);
		pane.add(lblEndereco);
		pane.add(txtEndereco);
		pane.add(lblRG);
		pane.add(txtrg);
		pane.add(lblTel);
		pane.add(txtTel);
		pane.add(lblEmail);
		pane.add(txtEmail);
		pane.add(lblCel);
		pane.add(txtCel);
		pane.add(lblCpf);
		pane.add(txtcpf);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela janela = new Janela();
	}

}
