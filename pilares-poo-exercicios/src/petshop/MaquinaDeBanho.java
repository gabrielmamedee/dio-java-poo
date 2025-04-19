package petshop;

public class MaquinaDeBanho {
    private boolean maquinaLivre;
    private int reservatorioAgua;
    private int reservatorioShampoo;

    public void darBanho() {
        if (!isMaquinaLivre()) {
            if (getReservatorioAgua() >= 10 && getReservatorioShampoo() >= 2) {
                setReservatorioAgua(getReservatorioAgua() - 10);
                setReservatorioShampoo(getReservatorioShampoo() - 2);
                System.out.println("Iniciando Banho!!!");
            } else {
                System.out.println("Níveis abaixo do mínimo");
                System.out.println("Água mínimo 10, nível atual: " + getReservatorioAgua());
                System.out.println("Shampoo mínimo 2, nível atual: " + getReservatorioShampoo());
            }
        } else {
            System.out.println("Desculpe a maquina precisa ter um Pet para dar banho!");
        }
    }

    public void abastecerAgua() {
        if (getReservatorioAgua() <= 28){
            setReservatorioAgua(getReservatorioAgua() + 2);
            System.out.println("Abastecimento realizado, nível atual = " + getReservatorioAgua());
        } else {
            System.out.println("Reservatório Cheio!!!");
        }
    }

    public void abastecerShampoo() {
        if (getReservatorioShampoo() <= 8) {
            setReservatorioShampoo(getReservatorioShampoo() + 2);
            System.out.println("Abastecimento realizado, nível atual = " + getReservatorioShampoo());
        } else {
            System.out.println("Reservatorio Cheio!!!");
        }
    }

    public int verificarAgua() {
        return getReservatorioAgua();
    }

    public int verificarShampoo() {
        return  getReservatorioShampoo();
    }

    public boolean verificarPet() {
        if (isMaquinaLivre()) {
            return false;
        } else {
            return true;
        }
    }

    public void colocarPet () {
        setMaquinaLivre(false);
        System.out.println("Pet inserido na maquína");
    }

    public void retirarPet () {
        System.out.println("Retirando Pet da maquína");
        setMaquinaLivre(true);
    }

    public void limparMaquina() {
        if (getReservatorioAgua() >= 3 && getReservatorioShampoo() >= 1) {
            setReservatorioAgua(getReservatorioAgua() - 3);
            setReservatorioShampoo(getReservatorioShampoo() - 1);
        } else {
            System.out.println("Níveis abaixo do mínimo");
            System.out.println("Água mínimo 3, nível atual: " + getReservatorioAgua());
            System.out.println("Shampoo mínimo 1, nível atual: " + getReservatorioShampoo());
        }
    }

    public boolean isMaquinaLivre() {
        return maquinaLivre;
    }

    public void setMaquinaLivre(boolean maquinaLivre) {
        this.maquinaLivre = maquinaLivre;
    }

    public int getReservatorioAgua() {
        return reservatorioAgua;
    }

    public void setReservatorioAgua(int reservatorioAgua) {
        this.reservatorioAgua = reservatorioAgua;
    }

    public int getReservatorioShampoo() {
        return reservatorioShampoo;
    }

    public void setReservatorioShampoo(int reservatorioShampoo) {
        this.reservatorioShampoo = reservatorioShampoo;
    }
}
