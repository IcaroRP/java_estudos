package ExerciciosIfElse;

import java.util.Scanner;

public class ExercicioUm {

    // Fazer um programa para ler um número inteiro, e depois dizer se este número é
    // negativo ou não.
    public static void main(String[] arg) {
        Scanner inputUser = new Scanner(System.in);

        int numero = inputUser.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else if (numero >= 0) {
            System.out.println("NÃO NEGATIVO");
        }

        inputUser.close();
    }

}

// EXERCICIO PROPOSTO CONCLUIDO
