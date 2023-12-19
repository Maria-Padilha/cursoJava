package POO;

public class Camaro {
    public static void main(String[] args) {
        Carro camaro = new Carro();
        camaro.ano = 2012;
        camaro.cor = "cinza";
        System.out.println("carro: camaro");
        System.out.println("ano: "+ camaro.ano);
        System.out.println("cor: "+ camaro.cor);

        camaro.ligar();
        camaro.acelerar();
    }
}