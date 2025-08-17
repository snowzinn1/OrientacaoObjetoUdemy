import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class ValoresRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Retangulo retangulo = new Retangulo();

        System.out.println("Coloque o valor da largura do retangulo");
        retangulo.largura = sc.nextDouble();

        System.out.println("Coloque o valor da altura do retangulo");
        retangulo.altura = sc.nextDouble();

        System.out.printf("area = %.2f%n", retangulo.area());
        System.out.printf("perimetro = %.2f%n", retangulo.perimetro());
        System.out.printf("diagonal = %.2f%n", retangulo.diagonal());



        sc.close();
    }
}
