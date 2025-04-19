package autodromo;

import java.util.Locale;
import java.util.Scanner;

public class Autodromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Carro carro = new Carro();

        boolean navegacao = true;

        do {
            System.out.println("_________________________________________");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a marcha");
            System.out.println("8 - Sair");

            System.out.println("Informe a opção escolhida: ");
            String opcao = scanner.next();

            System.out.println("_________________________________________");

            switch (opcao) {
                case "1":
                    carro.ligarCarro();
                    break;
                case "2":
                    carro.desligarCarro();
                    break;
                case "3":
                    carro.acelerar();
                    break;
                case "4":
                    carro.diminuirVelocidade();
                    break;
                case "5":
                    System.out.println("Informe o sentido que deseja virar: ");
                    String sentido = scanner.next();
                    carro.virarDirecao(sentido);
                    break;
                case "6":
                    carro.verificarVelocidade();
                    break;
                case "7":
                    carro.trocarMarcha();
                    break;
                case "8":
                    System.out.println("Fim do programa!");
                    navegacao = false;
                    break;
            }
        } while (navegacao);
    }
}
