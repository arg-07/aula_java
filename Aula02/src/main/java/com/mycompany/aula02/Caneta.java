
package com.mycompany.aula02;

public class Caneta {
    
    //Atributos
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Métodos
    
    public void status(){
        System.out.print("Uma caneta" + " " + this.cor);
        System.out.print(" Está tampada?" + " " + this.tampada);
        System.out.print(" Modelo: " + " " + this.modelo);
        System.out.print(" Ponta: " + " " + this.ponta);
        System.out.println(" A Carga está: " + " " + this.carga);
            
    }
    
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando...");
        }
        
    }
    
    public void tampar(){
        this.tampada = true;
        
    }
    
    public void destampar() {
        this.tampada = false;
        
    }
    
    
    
}
