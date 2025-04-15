package banco;
import java.util.Locale;
import java.util.Scanner;

public class AppBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaBanco c6 = new ContaBanco(
                111,
                1,
                "Gabriel",
                "123.123.123-12",
                1000.00);

        boolean navegacao = true;

        do {
            System.out.println("_________________________________________");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("7 - Sair");

            System.out.println("Informe a opção escolhida: ");
            String opcao = scanner.next();

            System.out.println("_________________________________________");

            switch (opcao){
                case "1": {
                    c6.consultarSaldo();
                    break;
                }
                case "2": {
                    c6.consultarChequeEspecial();
                    break;
                }
                case "3": {
                    System.out.println("Informe o valor a ser depossitado: ");
                    Double valorDepossito = scanner.nextDouble();
                    c6.depositar(valorDepossito);
                    break;
                }
                case "4": {
                    System.out.println("Informe o valor a ser sacado");
                    Double valorSaque = scanner.nextDouble();
                    c6.sacar(valorSaque, "Saque");
                    break;
                }
                case "5": {
                    System.out.println("Informe o código de barras:");
                    String codBarras = scanner.next();
                    System.out.println("Informe o valor do boleto");
                    Double valorBoleto = scanner.nextDouble();
                    c6.pagarBoleto(codBarras, valorBoleto);
                    break;
                }
                case "6": {
                    String statusCheque = c6.isStatusChequeEspecial() ? "Cheque especial em uso" : "Cheque especial não esta em uso";
                    System.out.println(statusCheque);
                    break;
                }
                case "7": {
                    System.out.println("Fim do programa");
                    navegacao = false;
                    break;
                }
            }

        } while (navegacao);
    }
}
