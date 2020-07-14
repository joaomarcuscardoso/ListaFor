package listafor;

import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class Trabalho_FOR {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Escreve um número ímpar, e mostraremos fatorial o dele!!");
        int numberQuat = t.nextInt();
        int number = numberQuat;
        for(int i = numberQuat;i > 1 ;i-- ) {     
            // 5x4 = 20 x 3 = 60 x 2 = 120
            numberQuat =  numberQuat * (i-1);   
            
        }
        if(number % 2 == 0 ) {
            System.out.println("O número que você digitou não é ímpar!");
        } else {
            System.out.println("O resultado do "+number+"! é "+numberQuat);
        
        }
        
        
    } 
}
