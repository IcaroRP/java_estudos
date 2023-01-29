package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class ExemploCaractere {

	public static void main(String[] args) {
		//Declarando variaveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0); //permite com que escreva uma palavra para ser armazenada
		System.out.println("Você Digitou: " + x);
		
		sc.close(); //para encerrar o recurso que iniciamos
	}

}
