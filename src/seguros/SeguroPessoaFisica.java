package seguros;

import java.util.Scanner;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SeguroPessoaFisica newConta = new SeguroPessoaFisica();

        System.out.printf("Pessoa Física, digite o seu nome: ");
        newConta.cliente = scan.nextLine();

        System.out.printf("Pessoa física, digite o seu saldo: ");
        newConta.saldo = scan.nextDouble();
        
        System.out.println("Cliente: "+newConta.cliente);
        newConta.exibirSaldo();
    }
}