package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVariosDados {

	public static void main(String[] args) {
		//Declarando variaveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next(); //permite com que escreva uma palavra para ser armazenada
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close(); //para encerrar o recurso que iniciamos
	}

}
