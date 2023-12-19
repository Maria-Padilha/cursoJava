import java.util.Scanner;

public class Fundamentos {
    public static void main(String[] args) {
        int escolha;
        boolean maiorIdade = false;
        int idade; 

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = scan.nextInt();

        if(idade > 18){
            maiorIdade = true;
            System.out.println("Eu sou maior de idade? "+maiorIdade);
        }
        else if(idade == 18){
            maiorIdade = true;
            System.out.println("Acabei de atingir a maioridade? "+maiorIdade);
        }
        else{
            System.out.println("Eu sou maior de idade? "+maiorIdade);
        }

        System.out.println("_______________________________");
        System.out.println("");
        System.out.println("Switch Case");

        System.out.println("Faça a sua escolhe: ");
        System.out.println("1 - cadastro / 2 - login / 3 - falar com um de nossos atendentes");
        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("FAÇA SEU CADASTRO AGORA MESMO");
                break;

            case 2:
                System.out.println("SEJA BEM VINDO DE VOLTA");
                break;

            case 3:
                System.out.println("Sistema fora do ar, volte depois!");
                break;

            default:
                System.out.println("Opps! Opção Inválida :( ");
                break;
        }

    }
}