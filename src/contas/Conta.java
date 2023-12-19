package contas;

public class Conta {
    // atributos
    protected String cliente;
    protected double saldo;
    protected double extrato;
    protected String action;

    // construtor
    public Conta(){
        System.out.println("Agência 0261");
    }

    // métodos
    protected void exibirSaldo(){
        System.out.println("Saldo: R$ "+saldo);
    }

    protected void exibirExtrato(){
        System.out.println("Saldo: R$ "+extrato);
    }

    protected void exibirExtratoDetalhado(){
        System.out.println("Saldo: R$ "+extrato);
    }
}