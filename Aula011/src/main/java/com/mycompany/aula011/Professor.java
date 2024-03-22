
package com.mycompany.aula011;

public class Professor extends Pessoa{
    
    //Atributos
    
    private String especialidade;
    private float salario;
    
    //Metodos internos
    
    public void receberAumento(){
        System.out.println("O professor: " + this.getNome() + " " + "de "
                + this.getEspecialidade() + " vai receber aumento de salário");
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
