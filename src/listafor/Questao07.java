/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafor;

import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class Questao07 {
       public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int percentPositivo = 0; 
        int percentNegativo = 0;
        
        for(int i = 1;i  <= 20 ;i++) {
            System.out.println("Escreve o número "+i);
            int number = t.nextInt();
           if(number > 0 ) {
               percentPositivo += 5;
           } else {
               percentNegativo += 5;
           }

        }
        System.out.println("O percentual de valores negativo é "+percentPositivo+"%");
        System.out.println("O percentual de valores positivo é "+percentNegativo+"%");
        
    } 
}
