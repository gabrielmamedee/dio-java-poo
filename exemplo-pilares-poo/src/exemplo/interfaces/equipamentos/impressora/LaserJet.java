package exemplo.interfaces.equipamentos.impressora;

public class LaserJet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("IMORIMINDO NA LASERJET");
    }
}
