
package com.mycompany.aula02;

public class Aula02 {

    public static void main(String[] args) {
        //Instanciando objeto
        
        Caneta c1 = new Caneta();
        
        Caneta c2 = new Caneta();
        
        //Atribuindo valores nos objetos instanciados
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "bick";
        c1.destampar();
        c1.rabiscar();
        
        c1.status();
        
        c2.modelo = "w3";
        c2.cor = "Preta";
        c2.tampar();
        c2.rabiscar();
        c2.status();
        
    }
}
