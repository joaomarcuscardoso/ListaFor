/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafor;

/**
 *
 * @author JoãoMarcus
 */

import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdNegativos = 0;
        
        for(int i = 1; i <=5; i++) {
            System.out.println("Digite o "+i+" número");
            int n = teclado.nextInt();
            if(n < 0) {
                qtdNegativos += 1;
            }
        }
        
        System.out.println("A quantidade de número negativos são "+qtdNegativos);
    }
}
