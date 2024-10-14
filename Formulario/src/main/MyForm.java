package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MyForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField c_dep_codigo;
	private JTextField c_dep_nome;
	String modoDep;
	String modoFunc;
	
	public void mainipulaInterfaceDep() {
		
	}

	public MyForm() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 682, 397);
		contentPane.setLayout(null);
		
		JPanel panel_Departamento = new JPanel();
		tabbedPane.addTab("Departamento", null, panel_Departamento, null);
		
		table = new JTable();
		table.setBounds(10, 31, 657, 119);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"C\u00F3digo", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		panel_Departamento.setLayout(null);
		panel_Departamento.add(table);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(217, 11, 46, 14);
		panel_Departamento.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(273, 6, 394, 20);
		panel_Departamento.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Departamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 200, 657, 158);
		panel_Departamento.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 21, 637, 41);
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo: ");
		panel_1.add(lblNewLabel_2);
		
		c_dep_codigo = new JTextField();
		panel_1.add(c_dep_codigo);
		c_dep_codigo.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 65, 637, 41);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nome: ");
		panel_1_1.add(lblNewLabel_3);
		
		c_dep_nome = new JTextField();
		panel_1_1.add(c_dep_nome);
		c_dep_nome.setColumns(10);
		
		JButton btn_depSalvar = new JButton("Salvar");
		btn_depSalvar.setBounds(243, 117, 89, 23);
		panel.add(btn_depSalvar);
		
		JButton btn_depCancelar = new JButton("Cancelar");
		btn_depCancelar.setBounds(342, 117, 89, 23);
		panel.add(btn_depCancelar);
		
		JButton btnNewButton = new JButton("Novo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_dep_codigo.setText("");
				c_dep_nome.setText("");
			}
		});
		btnNewButton.setBounds(49, 166, 105, 23);
		panel_Departamento.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(257, 166, 105, 23);
		panel_Departamento.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(447, 166, 105, 23);
		panel_Departamento.add(btnNewButton_2);
		
		JPanel panel_Funcionarios = new JPanel();
		tabbedPane.addTab("Funcion\u00E1rios", null, panel_Funcionarios, null);
		contentPane.add(tabbedPane);
		
		
		
	}
	
	
	
	
}

