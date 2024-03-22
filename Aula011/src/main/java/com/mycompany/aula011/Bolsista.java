
package com.mycompany.aula011;

public class Bolsista extends Aluno {
    
    //Atributos
    
    private float bolsa;
    
    //Métodos internos
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do Aluno: " + this.getNome());
        
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! pagamento facilitado ");
        
    }
    
    //Método Getters e Setters

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
    
    
    
    
}
