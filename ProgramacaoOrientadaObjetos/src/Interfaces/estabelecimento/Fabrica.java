package Interfaces.estabelecimento;

import javax.crypto.spec.DESKeySpec;

import Interfaces.equipamentos.copiadora.Copiadora;
import Interfaces.equipamentos.digitalizadora.Digitalizadora;
import Interfaces.equipamentos.digitalizadora.Scanner;
import Interfaces.equipamentos.impressora.Deskjet;
import Interfaces.equipamentos.impressora.Impressora;
import Interfaces.equipamentos.impressora.Laserjet;
import Interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

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