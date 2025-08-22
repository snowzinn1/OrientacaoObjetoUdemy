import entities.Conta;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Contabancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta;

        System.out.println("Coloque o numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Coloque o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("voce quer um deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's'){
            System.out.println("coloque o deposito inicial");
            double saldoinicial = sc.nextDouble();
            conta = new Conta(numero, titular, saldoinicial);
        }
        else {
            conta = new Conta(numero, titular);
        }
        System.out.println();
        System.out.println("Dados da conta");
        System.out.println(conta);

        System.out.println();
        System.out.println("coloque um valor de deposito");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("coloque um valor para retirar");
        double retirar = sc.nextDouble();
        conta.retirar(retirar);
        System.out.println("conta atualizada");
        System.out.println(conta);
        
       sc.close();
    }
}
