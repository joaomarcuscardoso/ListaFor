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
public class Questao05 {
    public static void main(String[] args) {     
        Scanner t = new Scanner(System.in);
        int qtdPrimo = 0; 
  
        
        for(int p = 1; p <= 5; p++) {
            System.out.println("Digite um número inteiro");
            int n = t.nextInt();           
            
            if( n >= 2) {                  
                int qtdDivisores = 0;
                for(int i =2; i< (n/2)+1; i++ ){
                    if(n % i == 0) {
                        qtdDivisores += 1;
                    }
                }
                if(qtdDivisores == 0) {
                    qtdPrimo += 1;
                }
            }            
        }

        System.out.println("A quantidade de número primos são "+qtdPrimo);
        
        
        
        
        
    }
}
