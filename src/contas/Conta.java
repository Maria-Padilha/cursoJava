package contas;

public class Conta {
    // atributos
    protected String cliente;
    protected double saldo;

    // construtor
    public Conta(){
        System.out.println("Agência 0261");
    }

    // métodos
    protected void exibirSaldo(){
        System.out.println("Saldo: R$ "+saldo);
    }

    void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque: R$ "+valor);
    }

    void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito: R$ "+valor);
    }

    void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência: R$ "+valor);
    }

    double soma(double cc, double cc2){
        double total = cc + cc2;
        return total;
    }

}