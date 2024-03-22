
package com.mycompany.aula13;

public class Aula13 {

    public static void main(String[] args) {
        
        //Programa Principal
        
        //instanciando objetos
        
        // Animal x = new Animal(); -- esse objeto não pode ser instanciado, pois essa classe é abstrata
        
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        
       c.reagir("vai apanhar");
       c.reagir(11, 45);
        
        
        
    }
}
