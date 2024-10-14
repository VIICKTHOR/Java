package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField campoLoginUser;
	private JPasswordField campoLoginSenha;

	public Login() {
		setBounds(100, 100, 333, 208);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 55, 297, 34);
			contentPanel.add(panel);
			{
				JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
				panel.add(lblNewLabel);
			}
			
			campoLoginUser = new JTextField();
			panel.add(campoLoginUser);
			campoLoginUser.setColumns(10);
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 91, 297, 34);
			contentPanel.add(panel);
			{
				JLabel lblNewLabel_1 = new JLabel("Senha: ");
				panel.add(lblNewLabel_1);
			}
			
			campoLoginSenha = new JPasswordField();
			campoLoginSenha.setColumns(10);
			panel.add(campoLoginSenha);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 297, 34);
		contentPanel.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN DE USU\u00C1RIO");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 11));
		panel.add(lblNewLabel_2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String username = campoLoginUser.getText();
				        String password = new String(campoLoginSenha.getPassword());

				        if (username.isEmpty() || password.isEmpty()) {
				            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
				            return;
				        }

				        boolean isValid = UserManager.login(username, password);
				        if (isValid) {
				            JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
				            setVisible(false);
				        } else {
				            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
				        }
				    }
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						dispose();
					}
				});
			}
		}
		
	}
}
