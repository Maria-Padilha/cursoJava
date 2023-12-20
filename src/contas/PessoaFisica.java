package contas;

import java.util.Scanner;
import contas.PessoFisica2;

public class PessoaFisica {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  
        Conta cc = new Conta();
        Conta cc2 = new Conta();
        
        System.out.printf("Pessoa Física, digite o seu nome: ");
        cc.cliente = scan.nextLine();

        System.out.printf("Deseja fazer uma operação? (s/n): ");
        String action = scan.nextLine();
        
        if (action.equals("s")) {

            System.out.printf("Pessoa física, digite o seu saldo inicial: ");
            cc.saldo = scan.nextDouble();

            System.out.printf("Digite a operação desejada: ");
            System.out.printf("1 - Depósito / 2 - saque: ");
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.printf("Defina o valor: ");
                    int dep = scan.nextInt();
                    System.out.println("--------------------------");
                    cc.depositar(dep);
                    cc.exibirSaldo();
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.printf("Defina o valor: ");
                    int saq = scan.nextInt();
                    System.out.println("--------------------------");
                    cc.sacar(saq);
                    cc.exibirSaldo();
                    System.out.println("--------------------------");
                    break;

                case 3:
                   System.out.println("Cliente: "+cc.cliente);
                    System.out.println("Favorecido: "+cc2.cliente);
                    System.out.println("Digite o valor: ");
                    int transferir = scan.nextInt();
                    cc.transferir(cc2, transferir);
                    
                    System.out.println("--------------------------");
                    System.out.println("Cliente: "+cc.cliente);
                    cc.exibirSaldo();
                    System.out.println("Cliente: "+cc2.cliente);
                    cc2.exibirSaldo();
                    System.out.println("--------------------------");
                    break;
            }
        }else{
            System.out.println("--------------------------");
            System.out.println("Cliente: "+cc.cliente);
            System.out.println("Saldo: "+cc.saldo);
            System.out.println("Finalizando atendimento!");
            System.out.println("--------------------------");
        }

        // outro cliente
        
        System.out.printf("Pessoa Física, digite o seu nome: ");
        cc2.cliente = scan.nextLine();

        System.out.printf("Deseja fazer uma operação? (s/n): ");
        String actions = scan.nextLine();
        
        if (actions.equals("s")) {

            System.out.printf("Pessoa física, digite o seu saldo inicial: ");
            cc2.saldo = scan.nextDouble();

            System.out.printf("Digite a operação desejada: ");
            System.out.printf("1 - Depósito / 2 - saque / 3 - transferência: ");
            int operation = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.printf("Defina o valor: ");
                    int dep = scan.nextInt();
                    System.out.println("--------------------------");
                    cc2.depositar(dep);
                    cc2.exibirSaldo();
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.printf("Defina o valor: ");
                    int saq = scan.nextInt();
                    System.out.println("--------------------------");
                    cc2.sacar(saq);
                    cc2.exibirSaldo();
                    System.out.println("--------------------------");
                    break;

                case 3:
                    System.out.println("Cliente: "+cc2.cliente);
                    System.out.println("Favorecido: "+cc.cliente);
                    System.out.println("Digite o valor: ");
                    int transferir = scan.nextInt();
                    cc2.transferir(cc, transferir);

                    System.out.println("--------------------------");
                    System.out.println("Cliente: "+cc2.cliente);
                    cc2.exibirSaldo();
                    System.out.println("Cliente: "+cc.cliente);
                    cc.exibirSaldo();
                    System.out.println("--------------------------");
                    break;
            
                default:
                    System.out.printf("Finalizando atendimento!");
                    break;
            }
        }else{
            System.out.println("--------------------------");
            System.out.println("Cliente: "+cc2.cliente);
            System.out.println("Saldo: "+cc2.saldo);
            System.out.println("Finalizando atendimento!");
            System.out.println("--------------------------");
        }

    }
}