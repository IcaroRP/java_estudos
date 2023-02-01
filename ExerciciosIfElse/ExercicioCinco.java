package ExerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double codigo = input.nextInt();
        double quantidade = input.nextInt();
        double total = 0;

        if (codigo == 1) {
            total = 4.00 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;
        } else if (codigo == 3) {
            total = 5.00 * quantidade;
        } else if (codigo == 4) {
            total = 2.00 * quantidade;
        } else if (codigo == 5) {
            total = 1.50 * quantidade;
        } else {
            System.out.println("CODIGO DO PEDIDO INVÁLIDO");
        }

        System.out.printf("Total: R$ %.2f", total);

        input.close();
    }
}
//EXERCICIO PROPOSTO CONCLUIDO