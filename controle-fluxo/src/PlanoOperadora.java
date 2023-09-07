// Modo condicional convencional
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M / T
        /*
         * if (plano == "B") {
         * System.out.println("100 minutos de ligação");
         * } else if (plano == "M") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("WhatsApp e Instagram grátis");
         * } else if (plano == "T") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("WhatsApp e Instagram grátis");
         * System.out.println("5Gb Youtube");
         * }
         * 
         * }
         */
        // Modo condicional switch/case
        // bom para encadeamento de soluções
        // sem o break no final de cada condição, ele imprime as linhas abaixo também
        // para o caso acima o switch case é aplicado em ordem decrescente abaixo

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}