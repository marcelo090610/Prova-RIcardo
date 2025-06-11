import java.util.Locale;
import java.util.Scanner;

class CoordenadasCartesianas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Valor de X: ");
            double x = scanner.nextDouble();

            System.out.print("Valor de Y: ");
            double y = scanner.nextDouble();

            if (x == 0.0 && y == 0.0) {
                System.out.println("Origem");
            } else if (y == 0.0) {
                System.out.println("Eixo X");
            } else if (x == 0.0) {
                System.out.println("Eixo Y");
            } else if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            } else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            } else if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
        }
    }
}