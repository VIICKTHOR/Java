package main;

public class Evento {
    private String nome;
    private String data;
    private String hora;
    private double preco;

    public Evento(String nome, String data, String hora, double preco) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nData: %s \nHora: %s \nPreço: R$ %.2f", nome, data, hora, preco);
    }
}
