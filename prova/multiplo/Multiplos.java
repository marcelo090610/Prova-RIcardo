package prova.multiplo;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        scanner.close();
    }
}