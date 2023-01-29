package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
	
	//EXERCICO PROPOSTO CONCLUIDO!

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		double horasDoFuncionario = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		
		double salario = horasDoFuncionario * valorPorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
