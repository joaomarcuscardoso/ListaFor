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
public class Questao03 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int soma = 0;
        int qtdMenorQueZero = 0;
        int qtdIntervalo = 0;
        
        for(int i =1; i <= 10;i++) {
            System.out.println("Digite o número "+i);
            int n = t.nextInt();
            soma += n;
            if(n < 0) {
                qtdMenorQueZero += 1;
                
            }else if( n >= 5 && n <= 50) {
                qtdIntervalo += 1;
            }
        }
        
        System.out.println("A média dos números é "+(soma / 10));
        System.out.println("A quantidade de valores menor que zero são "+qtdMenorQueZero);
        System.out.println("Os valores que estão no intervalo de 5 á 50, incluido eles mesmo são "+qtdIntervalo);
        
        
    }
}
