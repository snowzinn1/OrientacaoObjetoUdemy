import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Alunonotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Aluno aluno = new Aluno();

        System.out.println("nome");
        aluno.nome = sc.nextLine();
        System.out.println("Nota primeiro semestre");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Nota segundo semestre");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Nota terceiro semestre");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.00) {
            System.out.println("Não passou");
            System.out.printf("Pontos %.2f faltantes%n", aluno.pontosFaltantes());
        }
        else {
            System.out.println();
            System.out.println("Passou");
        }
        sc.close();
    }
}
