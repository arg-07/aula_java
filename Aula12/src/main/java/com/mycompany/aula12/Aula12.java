

package com.mycompany.aula12;

public class Aula12 {

    public static void main(String[] args) {
        
        //Instanciando objetos
        
       // Animal n = new Animal(); -- essa classe não pode ser instanciada por se tratar de uma classe abstrata
      
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        
        
        //atribunido valores aos objetos
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.locomover();
        p.locomover();
        r.locomover();
        
        c.locomover();
        
        
        
    }
}
