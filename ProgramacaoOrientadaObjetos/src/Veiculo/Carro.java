package Veiculo;

//classe específica
public class Carro extends Veiculo{

    public void ligar() {
        conferirCambio();
        conferirCombustível();
        System.out.println("carro ligado");
    }

    private void conferirCombustível() {
        System.out.println("conferindo combustível");
    }

    private void conferirCambio() {
        System.out.println("conferindo cambio em P");
    }
}
