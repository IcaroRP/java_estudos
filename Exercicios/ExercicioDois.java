package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

	//EXERCICO PROPOSTO CONCLUIDO!
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.printf("%.4f", area);
		
		sc.close();
	}

}
