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
public class Vetor04 {
    
    public static void main(String[] args){
        
        int vet[] = {3,7,6,1,9,4,2};
        for(int v:vet) {
            System.out.print(v);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrar o valor na posição" + p);
        
    }
    
}
