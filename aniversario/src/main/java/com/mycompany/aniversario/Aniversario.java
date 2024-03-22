
package com.mycompany.aniversario;

public class Aniversario {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2]; //criação de um vetor com espaço para tres elementos
        Livro[] l = new Livro[3]; //criação de um vetor com espaço para tres elementos
        
        //Instanciando os objetos para o vetor Pessoa
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        //Instanciando os objetos para o vetor Livro
        
        
        l[0] = new Livro("Apredendo java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciante", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        //Chamando métodos dos objetos instaciados
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
        System.out.println("===========================================");
        System.out.println(l[1].detalhes());  
        
    }
}
