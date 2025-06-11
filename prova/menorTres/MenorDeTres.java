
package prova.menorTres;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero: ");
            double n1 = scanner.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double n2 = scanner.nextDouble();
            System.out.print("Digite o terceiro numero: ");
            double n3 = scanner.nextDouble();

            double menor = n1;

            if (n1 <= n2 && n1 <= n3) {
                menor = n1;
            } else if (n2 <= n1 && n2 <= n3) {
                menor = n2;
            } else {
                menor = n3;
            }

            System.out.println("MENOR = " + menor);
        }
    }
}
