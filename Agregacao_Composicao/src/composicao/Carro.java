/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author lilianevale
 */
public class Carro {
    
    String modelo;
    Motor motor;
    
    public Carro (String modelo){
    this.modelo=modelo;
    this.motor=new Motor(123);
    
        System.out.println("modelo: "+ this.modelo);
       
    }
    
}
