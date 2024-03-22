
package com.mycompany.projetospessoas;

public class Funcionario extends Pessoa{
    //Atributo
    
    private String setor;
    private boolean trabalhando;
    
    //Métodos internos
    
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
        
    }
    
    //Métodos Getters e Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
    
    
    
}
