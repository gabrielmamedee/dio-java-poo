package petshop;

import java.util.Locale;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();

        boolean navegacao = true;

        do {
            System.out.println("_________________________________________");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - verificar nivel de água");
            System.out.println("5 - verificar nivel de shampoo");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("8 - retirar pet da máquina");
            System.out.println("9 - limpar maquina");
            System.out.println("10 - sair");

            System.out.println("Informe a opção escolhida: ");
            String opcao = scanner.next();

            System.out.println("_________________________________________");

            switch (opcao) {
                case "1":
                    maquinaDeBanho.darBanho();
                    break;
                case "2":
                    maquinaDeBanho.abastecerAgua();
                    break;
                case "3":
                    maquinaDeBanho.abastecerShampoo();
                    break;
                case "4":
                    System.out.println("Nível atual da água = " + maquinaDeBanho.verificarAgua());
                    break;
                case "5":
                    System.out.println("Nível atual do shampoo = " + maquinaDeBanho.verificarShampoo());
                    break;
                case "6":
                    String verificacao = maquinaDeBanho.verificarPet() ? "Tem pet" : "Não tem pet";
                    System.out.println(verificacao + "no banho");
                    break;
                case "7":
                    maquinaDeBanho.colocarPet();
                    break;
                case "8":
                    maquinaDeBanho.retirarPet();
                    break;
                case "9":
                    maquinaDeBanho.limparMaquina();
                    break;
                case "10":
                    System.out.println("Saindo!!!");
                    navegacao = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (navegacao);
    }
}
