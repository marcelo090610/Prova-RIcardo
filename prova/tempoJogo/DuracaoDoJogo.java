package prova.tempoJogo;

import java.util.Scanner;

public class DuracaoDoJogo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        }

        else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        scanner.close();
    }
}