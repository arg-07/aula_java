
package com.mycompany.aula05;

public class ContaBanco {
    //atributos
    
    public int numCont;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos personalizados
    
    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumCont());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
           
            this.setSaldo(50);
            
        } else if ("CP".equals(t) ){
            
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois tem débito! ");    
    } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        
    }
    
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!" + "na conta: " + " " + this.getDono());
        } else {
            System.out.println("Impossível depoistar em uma conta fechada! ");
        }
        
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + " " + this.getDono());
                
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
            
        }
        
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
            
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
 
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!" + " " + "por: " + this.getDono());
            
        }else {
            System.out.println("Impossível pagar uma conta fechada! ");
        }
        
    }
    
    // Métodos especiais construtors

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;   
    }
    
    // Métodos especiais Getters e Setters

    public int getNumCont() {
        return this.numCont;
    }

    public void setNumCont(int n) {
        this.numCont = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
        
    
}
