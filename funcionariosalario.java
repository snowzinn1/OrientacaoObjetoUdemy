import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class funcionariosalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();

        System.out.println("nome");
        funcionario.nome = sc.nextLine();
        System.out.println("Sálario bruto");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario" + funcionario);

        System.out.println();
        System.out.println("Qual percentual de aumento no salário");
        double aumento = sc.nextDouble();
        funcionario.aumentoDeSalario(aumento);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);



        sc.close();
    }
}
