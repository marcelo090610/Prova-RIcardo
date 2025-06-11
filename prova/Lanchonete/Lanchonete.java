package prova.Lanchonete;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Codigo do produto comprado: ");
            int codigo = scanner.nextInt();

            System.out.print("Quantidade comprada: ");
            int quantidade = scanner.nextInt();

            double preco = 0.0;

            switch (codigo) {
                case 1:
                    preco = 5.00;
                    break;
                case 2:
                    preco = 3.50;
                    break;
                case 3:
                    preco = 4.80;
                    break;
                case 4:
                    preco = 8.90;
                    break;
                case 5:
                    preco = 7.32;
                    break;
                default:
                    System.out.println("Codigo de produto invalido!");
                    break;
            }

            if (preco != 0.0) {
                double valorTotal = preco * quantidade;
                System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
            }
        }
    }
}