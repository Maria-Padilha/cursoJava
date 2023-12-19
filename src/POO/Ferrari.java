package POO;

// reutilização de método

public class Ferrari {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.ano = 2012;
        ferrari.cor = "vermelho";
        System.out.println("carro: ferrari");
        System.out.println("ano: "+ ferrari.ano);
        System.out.println("cor: "+ ferrari.cor);

        ferrari.ligar();
        ferrari.acelerar();
    }
}