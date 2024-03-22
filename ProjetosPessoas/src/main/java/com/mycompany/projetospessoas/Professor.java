
package com.mycompany.projetospessoas;

public class Professor extends Pessoa {
    //Atributo
    
    private String especialidade;
    private float salario;
    
    //Métodos internos
    
    public void receberAumento(float aum){
        this.salario += aum;
        
    }
    
    //Métodos Getters e Setters

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
}
