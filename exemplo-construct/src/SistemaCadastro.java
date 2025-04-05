public class SistemaCadastro {
    public static void main(String[] args) {
        //criando uma pessoa no sistema
        Pessoa marcos = new Pessoa("122.112.134-15", "Marcos");

        //definindo o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos?

        //imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
