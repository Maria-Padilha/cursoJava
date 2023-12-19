package POO;

public class Cessna {
    public static void main(String[] args) {
        Aviao cessna = new Aviao();
        cessna.ano = 2015;
        cessna.cor = "branco";
        cessna.envergadura = 11;

        System.out.println("Avião: cessna");
        System.out.println("Ano: "+cessna.ano);
        System.out.println("cor: "+cessna.cor);
        System.out.println("envergadura: "+cessna.envergadura + "m");

        cessna.aterrizar();
        cessna.desligar();
    }
}