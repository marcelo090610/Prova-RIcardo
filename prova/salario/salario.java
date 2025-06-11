package prova.salario;

import java.util.Locale;
import java.util.Scanner;

public class salario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salarioAtual = scanner.nextDouble();

        double novoSalario;
        double aumento;
        int porcentagem;

        if (salarioAtual <= 1000.00) {
            porcentagem = 20;
        }
        else if (salarioAtual <= 3000.00) {
            porcentagem = 15;
        }
        else if (salarioAtual <= 8000.00) {
            porcentagem = 10;
        }
        else {
            porcentagem = 5;
        }

        aumento = salarioAtual * porcentagem / 100;
        novoSalario = salarioAtual + aumento;

        System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %d %%%n", porcentagem);

        scanner.close();
    }
}
