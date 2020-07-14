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
public class Questao06 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Escreve um número, e mostraremos fatorial o dele!!");
        int numberQuat = t.nextInt();
        int number = numberQuat;
        for(int i = numberQuat;i > 1 ;i-- ) {     
            // 5x4 = 20 x 3 = 60 x 2 = 120
            numberQuat =  numberQuat * (i-1);   
            
        }
        if(number == 0) {
            numberQuat = 1;
        }
        
        System.out.println("O resultado do "+number+"! é "+numberQuat);
        
    }
}
