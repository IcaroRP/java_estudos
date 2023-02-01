package ExerciciosIfElse;

import java.util.Scanner;

public class ExercicioDois {

    // Fazer um programa para ler um número inteiro e dizer se este número é par ou
    // ímpar.

    public static void main(String[] arg) {
        Scanner inputUser = new Scanner(System.in);

        int numeroInteiro = inputUser.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        inputUser.close();
    }
}
// EXERCICIO PROPOSTO CONCLUIDO