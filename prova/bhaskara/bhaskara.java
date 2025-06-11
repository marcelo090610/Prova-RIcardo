package prova.bhaskara;

import java.util.Locale;
import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a coeficiente A: ");
            double c1 = scanner.nextDouble();
            System.out.print("Digite a coeficiente B: ");
            double c2 = scanner.nextDouble();
            System.out.print("Digite a coeficiente C: ");
            double c3 = scanner.nextDouble();

            if (c1 == 0) {
                System.out.print("O valor de A não pode ser 0");
            } else {
                double delta = Math.pow(c2, 2) - 4 * c1 * c3;

                if (delta < 0) {
                    System.out.print("Não existem raizes reais");
                } else {
                    double x1 = (-c2 + Math.sqrt(delta)) / (2 * c1);
                    double x2 = (-c2 - Math.sqrt(delta)) / (2 * c1);

                    System.out.printf("X1 = %.4f%n", x1);
                    System.out.printf("X2 = %.4f%n", x2);
                }
            }
        }
    }
}