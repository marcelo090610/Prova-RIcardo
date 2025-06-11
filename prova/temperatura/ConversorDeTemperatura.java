
package prova.temperatura;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = scanner.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double tempFahrenheit = scanner.nextDouble();

            double tempCelsius = 5.0 / 9.0 * (tempFahrenheit - 32);

            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", tempCelsius);
        }

        else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempCelsius = scanner.nextDouble();

            double tempFahrenheit = 9.0 / 5.0 * tempCelsius + 32;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", tempFahrenheit);
        }
        
        else {
            System.out.println("Escala invalida. Por favor, digite 'C' ou 'F'.");
        }

        scanner.close();
    }
}
