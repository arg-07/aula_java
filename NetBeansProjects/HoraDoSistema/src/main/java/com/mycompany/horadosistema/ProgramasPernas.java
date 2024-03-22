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
public class ProgramasPernas {
     public static void main(String[] args){
         Scanner tec = new Scanner(System.in);
         System.out.print("Quantas pernas? ");
         int perna = tec.nextInt();
         String tipo;
         System.out.println("Isso é um(a) ");
         switch(perna) {
             case 1: 
                 tipo = "Saci";
                 break;
             case 2:
                 tipo = "Bípege";
                 break;
             case 3:
                 tipo = "Tripé";
                 break;
             case 4:
                 tipo = "Quadrúpede";
                 break;
             case 6:
                 tipo = "Aranha";
                 break;
             default:
                 tipo = "ET";
                 break;    
             
         }
         
         System.out.println(tipo);
         
         
         
     }
    
}
