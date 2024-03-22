/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horadosistema;

import java.util.Arrays;

/**
 *
 * @author vibe
 */
public class Vetor01 {
    
    public static void main(String[] args){
        
        int n[] = {3,2,8,7,5,4};
        
        Arrays.sort(n);
        
        int pos = Arrays.binarySearch(n, 1);
        
        System.out.println(pos);
        
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov",
            "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        double v[] = {3.5, 2.75, 9, -4.5};
        
        for (double valor: v ) {
            
            System.out.print(valor + " ");
            
        }
        
        for (int c = 0; c < mes.length; c++) {
            
            System.out.println(mes[c]+ " " + "tem" + " " + tot[c] + " " +"dias");
            
        }
        
        for(int c = 0; c <= n.length -1; c++ ) {
            
            System.out.println("Na posição: " + c + " " + "Temos o valor: " + n[c]);    
        }
        
        
        
    }
    
}
