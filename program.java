import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Calculator calc = new Calculator();

        System.out.println("Insira o raio");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();

    }
}