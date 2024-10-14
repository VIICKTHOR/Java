package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;

public class SignUp extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField campoSignUpUser;
	private JPasswordField campoSignUpSenha;
	private JPasswordField campoSignUpSenhaR;

	public SignUp() {
		setBounds(100, 100, 377, 255);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 41, 314, 50);
			contentPanel.add(panel);
			{
				JLabel lblNewLabel = new JLabel("Novo Usu\u00E1rio: ");
				panel.add(lblNewLabel);
			}
			{
				campoSignUpUser = new JTextField();
				campoSignUpUser.setColumns(10);
				panel.add(campoSignUpUser);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 102, 320, 36);
			contentPanel.add(panel);
			{
				JLabel lblNovaSenha = new JLabel("Nova Senha: ");
				panel.add(lblNovaSenha);
			}
			{
				campoSignUpSenha = new JPasswordField();
				campoSignUpSenha.setColumns(10);
				panel.add(campoSignUpSenha);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 135, 305, 36);
			contentPanel.add(panel);
			{
				JLabel lblNovaSenha = new JLabel("Repita a Senha: ");
				panel.add(lblNovaSenha);
			}
			{
				campoSignUpSenhaR = new JPasswordField();
				campoSignUpSenhaR.setColumns(10);
				panel.add(campoSignUpSenhaR);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 330, 30);
			contentPanel.add(panel);
			{
				JLabel lblNewLabel_1 = new JLabel("CADASTRO DE NOVO USU\u00C1RIO");
				lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 11));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
				panel.add(lblNewLabel_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String username = campoSignUpUser.getText();
				        String password = new String(campoSignUpSenha.getPassword());
				        String confirmPassword = new String(campoSignUpSenhaR.getPassword());

				        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
				            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
				            return;
				        }

				        if (!password.equals(confirmPassword)) {
				            JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
				        } else {
				            boolean success = UserManager.signUp(username, password);
				            if (success) {
				                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
				                setVisible(false);
				            } else {
				                JOptionPane.showMessageDialog(null, "Usuário já existe!");
				            }
				        }
				    }
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
