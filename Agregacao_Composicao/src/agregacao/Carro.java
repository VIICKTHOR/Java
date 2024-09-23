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
public class Carro {
    
    String modelo;
    Motor motor;
    Motorista motorista;
    
    public Carro (String modelo, Motorista motorista){
    this.modelo=modelo;
    this.motor=new Motor(123);
    this.motorista=motorista;
    
        System.out.println("modelo: "+ this.modelo);
       
    }
    
}
