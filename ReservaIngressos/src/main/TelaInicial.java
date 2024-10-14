package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

    private static final long serialVersionUID = 1L;

    public TelaInicial() {
        setResizable(false);
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnInicial = new JMenu("Opções");
        menuBar.add(mnInicial);

        JMenuItem mntmEventos = new JMenuItem("Listar Eventos");
        mntmEventos.addActionListener(this::abrirListarEventos);
        mnInicial.add(mntmEventos);

        JMenuItem mntmSelecionar = new JMenuItem("Selecionar Evento");
        mntmSelecionar.addActionListener(this::abrirSelecionarEvento);
        mnInicial.add(mntmSelecionar);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblInicial = new JLabel("Sistema de");
        lblInicial.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblInicial.setBounds(147, 39, 277, 86);
        panel.add(lblInicial);

        JLabel lblGerenciadorDeCadastro = new JLabel("Reserva de Ingressos");
        lblGerenciadorDeCadastro.setFont(new Font("Times New Roman", Font.BOLD, 22));
        lblGerenciadorDeCadastro.setBounds(114, 78, 310, 86);
        panel.add(lblGerenciadorDeCadastro);
        
    }
       private void abrirListarEventos(ActionEvent e) {
   
            ListarEventos listarEventos = new ListarEventos();
            listarEventos.setVisible(true);
        }

        private void abrirSelecionarEvento(ActionEvent e) {

            SelecionarEvento selecionarEvento = new SelecionarEvento();
            selecionarEvento.setVisible(true);
        }
    }
