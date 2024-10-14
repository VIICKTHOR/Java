package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Temp;
	private JTextField textField_Conversao;
	private final ButtonGroup buttonGroup_In = new ButtonGroup();
	private final ButtonGroup buttonGroup_Out = new ButtonGroup();

	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_temp = new JPanel();
		panel_temp.setBounds(5, 5, 178, 34);
		panel_temp.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(panel_temp);
		panel_temp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_temp.add(panel_3);
		
		JLabel lblValor = new JLabel("Valor");
		panel_3.add(lblValor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(183, 5, 122, 251);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 42, 102, 31);
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_1 = new JLabel("De");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_8.add(lblNewLabel_1);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBounds(10, 118, 102, 31);
		panel_1.add(panel_9_1);
		
		JRadioButton rdbtn_InDecimal = new JRadioButton("Decimal");
		rdbtn_InDecimal.setSelected(true);
		buttonGroup_In.add(rdbtn_InDecimal);
		panel_9_1.add(rdbtn_InDecimal);
		rdbtn_InDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JPanel panel_9_2 = new JPanel();
		panel_9_2.setBounds(10, 151, 102, 31);
		panel_1.add(panel_9_2);
		
		JRadioButton rdbtn_InBinario = new JRadioButton("Bin\u00E1rio");
		buttonGroup_In.add(rdbtn_InBinario);
		panel_9_2.add(rdbtn_InBinario);
		rdbtn_InBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(305, 5, 122, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBounds(10, 42, 102, 31);
		panel_2.add(panel_8_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Para");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_8_1.add(lblNewLabel_1_1);
		
		JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBounds(10, 117, 102, 31);
		panel_2.add(panel_9_1_1);
		
		JRadioButton rdbtn_OutDecimal = new JRadioButton("Decimal");
		rdbtn_OutDecimal.setSelected(true);
		buttonGroup_Out.add(rdbtn_OutDecimal);
		panel_9_1_1.add(rdbtn_OutDecimal);
		
		
		JPanel panel_9_2_1 = new JPanel();
		panel_9_2_1.setBounds(10, 147, 102, 31);
		panel_2.add(panel_9_2_1);
		
		JRadioButton rdbtn_OutBinario = new JRadioButton("Bin\u00E1rio");
		buttonGroup_Out.add(rdbtn_OutBinario);
		panel_9_2_1.add(rdbtn_OutBinario);
		
		JPanel panel_tempTextfield = new JPanel();
		panel_tempTextfield.setAlignmentX(1.0f);
		panel_tempTextfield.setBounds(5, 39, 178, 45);
		contentPane.add(panel_tempTextfield);
		panel_tempTextfield.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_texfildIn = new JPanel();
		panel_tempTextfield.add(panel_texfildIn);
		
		textField_Temp = new JTextField();
		panel_texfildIn.add(textField_Temp);
		textField_Temp.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setAlignmentX(1.0f);
		panel_5.setBounds(5, 115, 178, 34);
		contentPane.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3_2 = new JPanel();
		panel_5.add(panel_3_2);
		
		JLabel lblConverso = new JLabel("Convers\u00E3o");
		panel_3_2.add(lblConverso);
		
		JPanel panel_6 = new JPanel();
		panel_6.setAlignmentX(1.0f);
		panel_6.setBounds(5, 149, 178, 45);
		contentPane.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3_3 = new JPanel();
		panel_6.add(panel_3_3);
		
		textField_Conversao = new JTextField();
		textField_Conversao.setEditable(false);
		panel_3_3.add(textField_Conversao);
		textField_Conversao.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setAlignmentX(1.0f);
		panel_7.setBounds(5, 205, 178, 51);
		contentPane.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3_4 = new JPanel();
		panel_7.add(panel_3_4);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in="",out="";
				
				if(rdbtn_InDecimal.isSelected()) {
					in ="d";
					if(rdbtn_OutDecimal.isSelected()) {
						out="d";
					}else if(rdbtn_OutBinario.isSelected()) {
						out="b";
					}
				}
				if(rdbtn_InBinario.isSelected()) {
					in ="b";
					if(rdbtn_OutDecimal.isSelected()) {
						out="d";
					}else if(rdbtn_OutBinario.isSelected()) {
						out="b";
					}
				}
				
				converter(in,out);
			}
		});
		panel_3_4.add(btnNewButton);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(339, 241, 1, -171);
		contentPane.add(verticalStrut);
		
	}
	
	public void converter(String in, String out){
		String temp="",conv="";
		
		try {
			temp = textField_Temp.getText();
			
		}catch(NumberFormatException e) {
			temp="0";
		}
		
		if(in=="d") {
			if(out=="d") {
				conv=temp;
				
				textField_Conversao.setText(conv);
			}else if(out=="b"){
				
				int dec = Integer.parseInt(temp);
				String bin="";
				
				while(dec>0) {
					bin+=""+dec%2;
					dec=(dec-(dec%2))/2;
					
				}
				bin = new StringBuilder(bin).reverse().toString();
				textField_Conversao.setText(bin);
			}
		}
		if(in=="b") {
			if(out=="d") {
				
				int dec = Integer.parseInt(temp, 2);
				
				
				textField_Conversao.setText(Integer.toString(dec));
						
			}else if(out=="b"){
				conv=temp;

				textField_Conversao.setText(conv);
			}
		}
		
		
		
		
	}
}
