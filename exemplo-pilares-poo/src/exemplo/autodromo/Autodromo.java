package exemplo.autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro bmwM1 = new Carro();
        bmwM1.setChassi("988493");
        bmwM1.ligar();

        Moto z400 = new Moto();
        z400.setChassi("824839");
        z400.ligar();
    }
}
