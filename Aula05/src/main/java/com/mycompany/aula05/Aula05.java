
package com.mycompany.aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumCont(1111);
        p1.setDono("Gustavo");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumCont(2222);
        p2.setDono("Karen");
        p2.abrirConta("CP");
      
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
}
