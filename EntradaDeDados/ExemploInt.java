package EntradaDeDados;

import java.util.Scanner;

public class ExemploInt {

	public static void main(String[] args) {
		//Declarando variaveis
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt(); //permite com que escreva uma palavra para ser armazenada
		System.out.println("Você Digitou: " + x);
		
		sc.close(); //para encerrar o recurso que iniciamos

	}

}
