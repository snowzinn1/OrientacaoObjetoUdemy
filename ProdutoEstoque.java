import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Insira os dados do produto");
        System.out.println("Nome");
        produto.nome = sc.nextLine();
        System.out.println("Preço");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Coloque o numero de produtos para ser adicionado no estoque:");
        int quantidade = sc.nextInt();
        produto.adicionarproduto(quantidade);

        System.out.println();
        System.out.println("Dados Atualizados: " + produto);

        System.out.println();
        System.out.println("Coloque o numero de produtos para ser removido no estoque:");
        quantidade = sc.nextInt();
        produto.removerproduto(quantidade);

        System.out.println();
        System.out.println("dados Atualizados: " + produto);

        sc.close();
    }
}
