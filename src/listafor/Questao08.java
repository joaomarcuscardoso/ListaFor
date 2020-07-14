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

public class Questao08 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int soma = 0;
        
        System.out.print("Digite a quantidade de notas:");
        int qtd = t.nextInt();
        int bomAproveitamento = 0;
        int alunoExemplar = 0;
        for(int aluno = 0; aluno < 50; aluno++ ) {
            for(int i =1; i<= qtd; i++) {
                System.out.println("Digite a nota "+i+" do "+(aluno+1)+" aluno");
                double nota = t.nextDouble();
                soma += nota;

                if(i == qtd) {
                    double media = soma / qtd;
                    soma = 0;
                    
                    System.out.println("Sua media é "+media);
                    if(media >= 7 && media <= 7.9) {
                        bomAproveitamento += 1;
                        System.out.println("Você recebeu hora pelo bom aproveitamento!!");
                    } else if ( media >= 8 && media <= 8.9) {
                        System.out.println("Você recebeu hora pelo honra otimo aproveitamento!!");
                    } else if ( media >= 9 && media < 10) {
                        System.out.println("Você recebeu hora pelo honra excelente aproveitamento!!");
                    } else if(media == 10) {
                        alunoExemplar += 1;
                        System.out.println("Você é um aluno exemplar!!");

                    }
                }
            }
        }
        System.out.println("As quantidades de alunos exemplares foram "+alunoExemplar);
        System.out.println("As quantidades de alunos com honras bom aproveitamento foram "+bomAproveitamento);
    }
}
