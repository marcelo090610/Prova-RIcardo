package prova.telefonia;
import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valorBase = 50.00;
        int franquiaMinutos = 100;
        double custoMinutoExcedente = 2.00;

        System.out.print("Digite a quantidade de minutos: ");
        int minutosConsumidos = scanner.nextInt();

        double valorAPagar;

        if (minutosConsumidos > franquiaMinutos) {

            int minutosExcedentes = minutosConsumidos - franquiaMinutos;

            valorAPagar = valorBase + (minutosExcedentes * custoMinutoExcedente);
        } else {

            valorAPagar = valorBase;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);

        scanner.close();
    }
}