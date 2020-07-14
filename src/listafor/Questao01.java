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
public class Questao01 {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema tabuada");
        Scanner t = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = t.nextInt();
        if(n == 0 ) {
            System.out.println("Número invalido, digite um número maior que zero");
        } else {
            for(int i=1; i <= 10; i++ ) {
               int mult = n * i;
               System.out.println(n+" x "+i+" = "+mult);
            }        
        }
    }
}
