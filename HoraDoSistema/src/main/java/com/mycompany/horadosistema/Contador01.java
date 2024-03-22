/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horadosistema;

/**
 *
 * @author vibe
 */
public class Contador01 {
    
     public static void main(String[] args){
         
         int cc = 0;
         
         while (cc < 10) {
             
             cc++; //cc = cc + 1
             
             if (cc == 2 || cc == 3 || cc == 4) {
                  
                 continue;
                   
             }
             
             if (cc == 7) {
                 
                 break;
                 
             }
             
              System.out.println("Cambalhota" + cc);
             
             
         }
         
         
         
     }
    
}
