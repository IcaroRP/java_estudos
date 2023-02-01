package ExerciciosIfElse;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//ordem crescente ou decrescente.

public class ExercicioTres {
    public static void main(String[] arg) {
        // O input do usuario
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        input.close();
    }
}
// EXERCICIO PROPOSTO CONCLUIDO