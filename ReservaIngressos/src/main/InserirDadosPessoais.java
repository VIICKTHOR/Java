package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InserirDadosPessoais extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextField cpfField;
    private final Evento[] eventosSelecionados;
    private final int[] quantidades;

    public InserirDadosPessoais(Evento[] eventosSelecionados, int[] quantidades) {
        this.eventosSelecionados = eventosSelecionados;
        this.quantidades = quantidades;

        setTitle("Inserir Dados Pessoais");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        setLocationRelativeTo(null);

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        JButton btnConfirmar = new JButton("Confirmar Dados");
        btnConfirmar.addActionListener(this::confirmarDados);
        add(btnConfirmar);
    }

    private void confirmarDados(ActionEvent e) {
        String nome = nomeField.getText();
        String email = emailField.getText();
        String cpf = cpfField.getText();

        if (nome.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            exibirResumo(nome, email, cpf);
            dispose();
        }
    }

    private void exibirResumo(String nome, String email, String cpf) {
        StringBuilder resumo = new StringBuilder("Resumo da Reserva:\n\n");
        double precoTotal = 0;

        for (int i = 0; i < eventosSelecionados.length; i++) {
            Evento evento = eventosSelecionados[i];
            int quantidade = quantidades[i];
            double precoEvento = evento.getPreco() * quantidade;
            precoTotal += precoEvento;

            resumo.append(String.format("%s\nData: %s\nHora: %s\nQuantidade: %d\nPreço: R$ %.2f\n\n",
                    evento.getNome(), evento.getData(), evento.getHora(), quantidade, precoEvento));
        }

        resumo.append(String.format("Preço Total: R$ %.2f\n\n", precoTotal));
        resumo.append("Informações do Usuário:\n");
        resumo.append(String.format("Nome: %s\nEmail: %s\nCPF: %s", nome, email, cpf));

        JOptionPane.showMessageDialog(this, resumo.toString(), "Resumo da Reserva", JOptionPane.INFORMATION_MESSAGE);
        Main.fim();
        
    }
}
