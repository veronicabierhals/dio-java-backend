import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            if (parametroUm < parametroDois) {
                contar(parametroUm, parametroDois);
            } else {
                throw new ParametrosInvalidosException();
            }
        } catch (ParametrosInvalidosException e) {
            System.err.println("O primeiro parâmetro deve ser um número menor do que o segundo parâmetro. Tente novamente.");
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int contador = 0; contador <= contagem; contador++) {
            System.out.println(contador);
        }
    }
}

class ParametrosInvalidosException extends RuntimeException {

}