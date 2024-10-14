package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JDialog;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private final Action actionLogin = new SwingAction_Login();
	private final Action actionSignUp = new SwingAction_SignUp();
	

	public MyFrame() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicial = new JMenu("Login/SingUp");
		menuBar.add(mnInicial);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.setAction(actionLogin);
		mnInicial.add(mntmLogin);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.setAction(actionSignUp);
		mnInicial.add(mntmCadastro);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblInicial = new JLabel("Bem Vindo ao");
		lblInicial.setFont(new Font("Arial", Font.BOLD, 22));
		lblInicial.setBounds(125, 41, 309, 86);
		panel.add(lblInicial);
		
		JLabel lblGerenciadorDeCadastro = new JLabel("Gerenciador de Cadastro!!!");
		lblGerenciadorDeCadastro.setFont(new Font("Arial", Font.BOLD, 22));
		lblGerenciadorDeCadastro.setBounds(67, 78, 357, 86);
		panel.add(lblGerenciadorDeCadastro);

	}
	private class SwingAction_Login extends AbstractAction {
		public SwingAction_Login() {
			putValue(NAME, "Login");
			putValue(SHORT_DESCRIPTION, "Efetuar Login");
		}
		public void actionPerformed(ActionEvent e) {
			
			try {
				Login dialog = new Login();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
				
			}
		
		}
	}
	private class SwingAction_SignUp extends AbstractAction {
		public SwingAction_SignUp() {
			putValue(NAME, "SignUp");
			putValue(SHORT_DESCRIPTION, "Efetuar Cadastro de Login");
		}
		public void actionPerformed(ActionEvent e) {
			
			try {
				SignUp dialog = new SignUp();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
