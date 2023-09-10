package Interfaces.equipamentos.multifuncional;

import Interfaces.equipamentos.copiadora.Copiadora;
import Interfaces.equipamentos.digitalizadora.Digitalizadora;
import Interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }

}
