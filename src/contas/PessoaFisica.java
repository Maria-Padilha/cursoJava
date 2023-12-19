package contas;

import java.util.Scanner;

public class PessoaFisica {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  

        Conta cc = new Conta();
        
        System.out.printf("Pessoa Física, digite o seu nome: ");
        cc.cliente = scan.nextLine();

        System.out.printf("Deseja realizar alguma ação? (s/n): ");
        cc.action = scan.nextLine();

        System.out.printf("Pessoa física, digite o seu saldo inicial: ");
        cc.saldo = scan.nextDouble();
        
        System.out.println("Cliente: "+cc.cliente);

        if(cc.action.equals("s")){
            System.out.println("Digite a ação desejada: ");
            System.out.println("1 - Depósito / 2 - Saque / 3 - Extrato");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Digite o valor: ");
                    int dep = scan.nextInt();
                    cc.extrato = cc.saldo + dep;
                    System.out.println("Depósito efetuado com sucesso");
                    cc.exibirExtrato();
                    break;

                case 2:
                    System.out.printf("Digite o valor: ");
                    int saq = scan.nextInt();
                    cc.extrato = cc.saldo - saq;
                    System.out.println("Saque efetuado com sucesso");
                    cc.exibirExtrato();
                    break;

                case 3:
                    cc.exibirExtratoDetalhado();
                    break;
            
                default:
                    break;
            }
        }
    }
}