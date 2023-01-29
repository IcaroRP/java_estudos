package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDouble {

	public static void main(String[] args) {
		//Declarando variaveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble(); //permite com que escreva uma palavra para ser armazenada
		System.out.printf("Você Digitou: %.2f", x);
		
		sc.close(); //para encerrar o recurso que iniciamos

	}

}
