package exemplo.interfaces.equipamentos.impressora;

public class DeskJet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO NA DESKJET");
    }
}
