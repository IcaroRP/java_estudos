package ExerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOito {
    public static void main (String [] arg) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valorRenda = input.nextDouble();
        double imposto = 0.0; //MUDAR ISSO AQUI

        if (valorRenda <= 2000.0) {
            imposto = 0.0;
        } 
        else if (valorRenda <= 3000.0) {
            imposto = (valorRenda - 2000.0) * 0.08;
        }
        else if (valorRenda <=4500.0) {
            imposto = (valorRenda - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (valorRenda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
        
        input.close();

    }
}
