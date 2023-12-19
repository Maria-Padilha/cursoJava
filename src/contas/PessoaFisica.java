package contas;

import java.util.Scanner;

public class PessoaFisica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta cc = new Conta();

        System.out.printf("Pessoa Física, digite o seu nome: ");
        cc.cliente = scan.nextLine();

        System.out.printf("Pessoa física, digite o seu saldo: ");
        cc.saldo = scan.nextDouble();
        
        System.out.println("Cliente: "+cc.cliente);
        cc.exibirSaldo();
    }
}