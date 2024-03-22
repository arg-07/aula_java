
package com.mycompany.projetospessoas;

public class Aluno extends Pessoa{
    //Atributos
    
    private int mat;
    private String curso;
    
    //Métodos internos
    
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
        
    }
    
    //Métodos Getters e Setters

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
    
    
    
}
