package q10;

public class Conta {
    
    double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor){
        saldo -= valor;
    }
    
    public void trasferir(Conta a , double valor){
        a.depositar(valor);
        retirar(valor);
    }
}

