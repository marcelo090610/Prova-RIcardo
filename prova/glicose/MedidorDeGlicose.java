package prova.glicose;

import java.util.Locale;
import java.util.Scanner;

public class MedidorDeGlicose {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a medida da glicose: ");
            double medidaGlicose = scanner.nextDouble();

            String classificacao;

            if (medidaGlicose <= 100.0) {
                classificacao = "Normal";
            } else if (medidaGlicose <= 140.0) {
                classificacao = "Elevado";
            } else {
                classificacao = "Diabetes";
            }

            System.out.println("Classificacao: " + classificacao);
        }
    }
}
