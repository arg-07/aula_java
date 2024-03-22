/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horadosistema;

import java.util.Scanner;
/**
 *
 * @author vibe
 */
public class ProgramaIdade {
    
    public static void main(String[] args){
    
        Scanner t = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        System.out.println("Sua idade é: " + i);
        
        if (i>=18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        
    }
    
}
