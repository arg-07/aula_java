package com.mycompany.primeiroprograma;

import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Qual a sua nota: ");
        float nota = teclado.nextFloat();
        
        
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        //System.out.println("sua nota é: " + nota);
        //System.out.println("Nome do Aluno: " + nome);
        //System.out.printf("Sua nota é %.2f \n", nota);
        //System.out.printf("Sua nota de %s é %.2f \n", nome, nota);
        //System.out.format("Sua nota é %.2f", nota);
    }
}
