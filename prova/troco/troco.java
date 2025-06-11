
package prova.troco;

import java.util.Locale;
import java.util.Scanner;

public class troco{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        double qtd = scanner.nextDouble();
        System.out.print("Digite a quantia recebida: ");
        double dinheiro = scanner.nextDouble();

        double total = preco * qtd;

        if(total > dinheiro){
            System.out.print("Dinheiro Insuficiente");
        }
        else{
            double troco = dinheiro - total;
            System.out.print("Troco:" + troco);
        }
        
        scanner.close();
    }
}
