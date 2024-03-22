/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horadosistema;

import javax.swing.JOptionPane;

/**
 *
 * @author vibe
 */
public class ExercicioRepita {
    
    public static void main(String[] args){
        
        int n, s = 0;
        int m;
        int i = 0;
        int p = 0;
        
        do {
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 Interrompe!)</em></html>"));
            
            s += n;
            
            m = n % 2;
            
            if (m != 0) {
                
                i++;
            }else {
              
               p++;
                
            }
            
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "Resultado final -------------------" + 
                "Somatório Vale: " + s);
        JOptionPane.showMessageDialog(null, "Nº Impar: " + i
                                        + " " +
                                      "<html><br>Nº Par: </html>" + p);
     
        
    }
    
}
