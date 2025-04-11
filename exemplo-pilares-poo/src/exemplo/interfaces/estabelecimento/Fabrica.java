package exemplo.interfaces.estabelecimento;

import exemplo.interfaces.equipamentos.copiadora.Copiadora;
import exemplo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import exemplo.interfaces.equipamentos.impressora.DeskJet;
import exemplo.interfaces.equipamentos.impressora.Impressora;
import exemplo.interfaces.equipamentos.impressora.LaserJet;
import exemplo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
