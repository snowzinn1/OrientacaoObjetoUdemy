package entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valortotalemestoque(){
        return preco * quantidade;
    }
    public void adicionarproduto(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerproduto(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome
                + ", $"
                +String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $"
                +String.format("%.2f",valortotalemestoque());
    }

}
