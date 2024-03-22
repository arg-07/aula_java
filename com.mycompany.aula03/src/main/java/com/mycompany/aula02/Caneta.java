
package com.mycompany.aula02;

public class Caneta {
    
    //Atributos
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Métodos
    
    void status(){
        System.out.print("Uma caneta" + " " + this.cor);
        System.out.print(" Está tampada?" + " " + this.tampada);
        System.out.print(" Modelo: " + " " + this.modelo);
        System.out.print(" Ponta: " + " " + this.ponta);
            
    }
    
    void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando...");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar() {
        this.tampada = false;
        
    }
    
    
    
}
