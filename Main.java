import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Declarando inteiro
			int y = 32;
			
		//Declarando ponto flutuante
			double x = 10.35784;
			
		//Imprimindo int, double
			System.out.println(y);
			System.out.println(x);
			
		//Delimitando quantas casas decimais imprimir
					//  Esse "f" é a abreviação de formatado
			System.out.printf("%.2f%n", x);
			
		//Codigo para mudar a virgula pelo ponto
			Locale.setDefault(Locale.US); //obs: o "import java.util.Locale;" precisa ser importado
			System.out.printf("%.4f%n", x);
			
		//Imprimindo uma mensagem no console
			System.out.println("Boa tarde!");
			
		//Concatenação
			
			System.out.println("Resultado = " + x + " Metros");
		//Concatenação com printf
			
			System.out.printf("Resultado = %.2f metros%n", x); //OBS: "%n é para quebra de linha" e o %.2f é o marcador.
			
		//Concatenando vários elementos em um mesmo comando de escrita
		//OBS: %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
			String nome = "Maria";
			int idade = 31;
			double renda = 4000.0;
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
