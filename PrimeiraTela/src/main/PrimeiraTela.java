package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeiraTela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Nome;
	private final ButtonGroup buttonGroup_sexo = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 403);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 636, 35);
		contentPane.add(panel);
		
		JLabel lblNewLabel_Nome = new JLabel("Nome: ");
		lblNewLabel_Nome.setBounds(225, 8, 41, 14);
		lblNewLabel_Nome.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(269, 5, 136, 20);
		textField_Nome.setColumns(10);
		panel.setLayout(null);
		panel.add(lblNewLabel_Nome);
		panel.add(textField_Nome);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(195, 21, 20, 142);
		panel.add(horizontalStrut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 49, 636, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_Sexo = new JLabel("Sexo: ");
		lblNewLabel_Sexo.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_Sexo);
		
		JRadioButton rdbtnNewRadioButton_Masculino = new JRadioButton("Masculino");
		buttonGroup_sexo.add(rdbtnNewRadioButton_Masculino);
		panel_1.add(rdbtnNewRadioButton_Masculino);
		
		JRadioButton rdbtnNewRadioButton_Feminino = new JRadioButton("Feminino");
		buttonGroup_sexo.add(rdbtnNewRadioButton_Feminino);
		panel_1.add(rdbtnNewRadioButton_Feminino);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 90, 636, 35);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_Maioridade = new JCheckBox("Maior de Idade");
		chckbxNewCheckBox_Maioridade.setBounds(225, 7, 184, 23);
		panel_2.add(chckbxNewCheckBox_Maioridade);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 197, 636, 104);
		contentPane.add(panel_2_1);
		
		JButton btnNewButton_Maior = new JButton("Mostrar");
		btnNewButton_Maior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sexo="sexo não informado",idade="Não foi informado a maioridade";
				if(rdbtnNewRadioButton_Masculino.isSelected()) {
					sexo="masculino";
				}else if(rdbtnNewRadioButton_Feminino.isSelected()){
					sexo="feminino";
				} 
				
				if(chckbxNewCheckBox_Maioridade.isSelected()) {
					idade="Possui maioridade";
				}else {
					idade="Não possui maioridade";
				}
				
				JOptionPane.showMessageDialog(rootPane, "Nome: "+textField_Nome.getText()+"\nSexo: "+sexo+"\n"+idade, "Seus Dados", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_Maior.setBounds(262, 44, 115, 49);
		panel_2_1.add(btnNewButton_Maior);
	}
}
