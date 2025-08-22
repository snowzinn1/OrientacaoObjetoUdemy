package entities;

public class Conta {
    private int numero;
    private String titular;
    private double saldoInicial;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero =  numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void deposito(double quantia){
        saldoInicial += quantia;
    }
    public void retirar(double quantia){
        saldoInicial -= quantia + 5.0;
    }

    public String toString() {
        return "conta "
                + numero
                + ", titular: "
                + titular
                + ", saldo inicial: $ "
                + String.format("%.2f", saldoInicial);
    }

}
