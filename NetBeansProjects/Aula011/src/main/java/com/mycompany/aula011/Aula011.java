
package com.mycompany.aula011;

public class Aula011 {

    public static void main(String[] args) {
        
        //instanciando objetos
        
        //Pessoa p1 = new Pessoa(); esse objeto não pode ser instanciado 
        //por ser tratar de uma classe abstarta
        
        Visitante v1 = new Visitante();
   
        
        //Atribuindo valores aos objetos
        
        v1.setNome("Thiago");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Adriano");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setMatricula(1121);
        b1.setNome("Fábio");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        
        p1.setNome("Mauro");
        p1.setIdade(35);
        p1.setSexo("M");
        p1.setSalario(4500.00f);
        p1.setEspecialidade("Matemática");
        p1.receberAumento();
        
        
        
        
    }
}
