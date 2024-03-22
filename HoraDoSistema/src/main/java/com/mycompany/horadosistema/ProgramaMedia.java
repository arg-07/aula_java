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
public class ProgramaMedia {
    
    public static void main(String[] args){
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua primeira nota: ");
    float n1 = teclado.nextFloat();
    System.out.println("Digite sua segunda nota: ");
    float n2 = teclado.nextFloat();
    float m = (n1 + n2) / 2;
    
    System.out.println("Sua média foi: " + m);
        
    if (m>9) {
        
        System.out.println("Parabéns. Pequeno gafanhoto!");
        
    }   
        
        
    }
    
}
