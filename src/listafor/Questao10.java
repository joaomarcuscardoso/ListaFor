/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafor;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
 *
 * @author JoãoMarcus
 */
public class Questao10 {
    public static void main(String[] args) {
        System.out.println("Bem vindo á entrevista de emprego!!");
        Scanner t = new Scanner(System.in);
        System.out.println("Você deseja trabalhar no que: 1 para Comércio 2 para indústria");
        int cargo = t.nextInt();
        
        System.out.println("Você tem segundo grau completo?(S)Sim ou (N)Não");
        String escolaridade = t.nextLine();
        
        int requisitos = 0;
        if(cargo == 1) {
            if(escolaridade.equalsIgnoreCase("s") || escolaridade.equalsIgnoreCase("sim")) {
                requisitos += 1;
                System.out.println("Você cumpre o nível de escolaridade necessario para o cargo!!");
            } else {
                System.out.println("Seu nível de escolaridade é insuficiente para ocupar o cargo!!");
            }

            System.out.println("Você tem experiencia na área de vendas?(S)Sim ou (N)Não");
            String experienciaCargo = t.nextLine();

            if(experienciaCargo.equalsIgnoreCase("Sim") || experienciaCargo.equalsIgnoreCase("S")) {
                requisitos += 1;
                System.out.println("Você preenche os requisitos de experiencia da área.");
            } else {
                System.out.println("Você não tem experiência na área, por esse motivo você nao foi aceito.");
            }  

            System.out.println("Quanto tempo você mora nessa cidade? ");
            int tempoQueMora = t.nextInt();

            if(tempoQueMora >= 1) {
                requisitos += 1;
                System.out.println("Você preencheu os requisitos de tempo de moradia.");
            } else {
                System.out.println("Você não mora tempo suficiente na cidade Para preencher essa vagas.");
            }


            if(requisitos == 3) {
                System.out.println("Você foi aceito no trabalho, parabéns!");
            } else {
                System.out.println("Você foi reprovado no processo de seleção, desculpe!");
            }

        }
    
        
    }
}
