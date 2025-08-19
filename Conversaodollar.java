import util.Currencyconverter;

import java.util.Locale;
import java.util.Scanner;

public class Conversaodollar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = Currencyconverter.dollarToReal(amount,dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();

    }
}
