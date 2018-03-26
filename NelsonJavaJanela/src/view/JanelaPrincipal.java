package view;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JanelaPrincipal extends JFrame {
	JLabel lblpreencher = new JLabel(" Preencha os campos e clique em Gravar Dados ");
    JLabel lblNome = new JLabel("Nome: ");  
	JTextField txtNome = new JTextField();
	JLabel lblEnd = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();
	JLabel lblBai = new JLabel("Bairro: ");
	JTextField txtBai = new JTextField();
	JLabel lblEst = new JLabel("Estado: ");
	JComboBox txtEst = new JComboBox();
	JLabel lblTel = new JLabel("Telefone: ");
	JTextField txtTel = new JTextField();
	JLabel lblCel = new JLabel("Celular: ");
	JTextField txtCel = new JTextField();
	JLabel lblEmail = new JLabel("E-mail: ");
	JTextField txtEmail = new JTextField();
	
	public JanelaPrincipal() {
		super("MINHA JANELA");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblpreencher.setBounds(20,0,300,25);
		paine.add(lblpreencher);
		
		lblNome.setBounds(20,20,300,25);
		paine.add(lblNome);
		txtNome.setBounds(80,20,300,25);
		paine.add(txtNome);
		
		lblEnd.setBounds(20, 50, 300, 25);
		paine.add(lblEnd);
		txtEnd.setBounds(80, 50, 300, 25);
		paine.add(txtEnd);		
		
		lblBai.setBounds(20, 80, 300, 25);
		paine.add(lblBai);
		txtBai.setBounds(80, 80, 300, 25);
		paine.add(txtBai);
		
		lblEst.setBounds(20, 110, 300, 25);
		paine.add(lblEst);
		txtEst.setBounds(80, 110, 300, 25);
		paine.add(txtEst);
		
		lblTel.setBounds(20, 140, 300, 25);
		paine.add(lblTel);
		txtTel.setBounds(80, 140, 300, 25);
		paine.add(txtTel);
		
		lblCel.setBounds(20, 170, 300, 25);
		paine.add(lblCel);
		txtCel.setBounds(80, 170, 300, 25);
		paine.add(txtCel);
		
		lblEmail.setBounds(20, 200, 300, 25);
		paine.add(lblEmail);
		txtEmail.setBounds(80, 200, 300, 25);
		paine.add(txtEmail);
		
		
		
		
		
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();

	}
}