public class Conta {
    //variavel da classe conta
    double saldo = 10.0;

    public void sacar (Double valor){
        //variavel local de metodo
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo (){
        //disponivel em toda classe
        System.out.println(saldo);

        //somente o método sacar conhece esta variavel
        System.out.println(novoSaldo); //não é possível executar
    }

    public double calcularDividaExponencial (){
        //variável local
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for (int x = 1; x <= 5; x++){
            //esta variavel sera reiniciada a cada execução do loop
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante - valorCalculado;
            //igual a -> valorMontante -= valorCalculado;
        }
        //escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora do 'for'
        return valorMontante;
    }
}
