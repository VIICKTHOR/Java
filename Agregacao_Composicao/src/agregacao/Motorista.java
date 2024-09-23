/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author lilianevale
 */
public class Motorista {
    String nome;
    int cnh;
    
    public Motorista(String nome, int cnh){
    this.nome=nome;
    this.cnh=cnh;
        System.out.println("nome:"+this.nome);
        System.out.println("cnh: "+ this.cnh);
    }
    
}
