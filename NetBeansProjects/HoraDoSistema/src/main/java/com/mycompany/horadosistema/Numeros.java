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
public class Numeros {
    public static void main(String[] args){
        
        int n, s = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n;
            System.out.print("Quer continuar? [S/N]");
            resp = teclado.next();
            
            
        } while (resp.equals("S"));
        
        System.out.println("A soma de todos os valores é: " + s);
        
        
        
    }
    
}
