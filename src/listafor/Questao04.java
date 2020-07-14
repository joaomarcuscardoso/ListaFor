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
public class Questao04 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int soma =0; int numeroAnterior = 0; int maiorValor = 0; int menorValor = 0;
        System.out.println("Digite 1 número");
        int n = t.nextInt();
        soma += n;
        maiorValor = n;
        menorValor = n;
        
        for(int i =1;i <= 4; i++) {
            System.out.println("Digite o "+(i+1)+" número");
             n = t.nextInt();
            if(n > maiorValor) {
                maiorValor = n;                   
            }

            if(n < menorValor) {

                menorValor = n;                    
            }
            soma += n;
        }
        System.out.println("A média dos 500 números é "+(soma / 5));
        System.out.println("o maior valor é "+maiorValor);
        System.out.println("o menor valor é "+menorValor);
    }   
}
