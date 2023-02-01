package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	// EXERCICO PROPOSTO CONCLUIDO!

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();

		int peca2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorTotalPeca1 = quantidadePeca1 * valorPeca1;
		double valorTotalPeca2 = quantidadePeca2 * valorPeca2;

		double valorTotal = valorTotalPeca1 + valorTotalPeca2;

		System.out.println("Peça 1 = " + peca1 + " Peça 2 = " + peca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

		sc.close();

	}

}
