public class Metodos {
    //publico double (dois argumentos)
    public double somar (int num1, int num2){
        //lógica - finalidade do método
        return...;
    }

    //publico, não retorna nada (arg texto)
    public void imprimir (String texto){
        //lógica- finalidade do método
        //não precisa return, pois não retorna resultados
    }

    // throws Exception alerta de excessão
    public double dividir (int dividendo, int divisor) throws Exception {}

    //não está visivel para outras classes
    private void metodoPrivado(){}

    //alguns equivocos estruturais
    public void validar (){
        //deveria retornar um booleano true/false
        //pois está dizendo que quer validar algo
    }

    public void calcularEnviar(){
        //deve apresentar uma unica responsbilidade e não duas
        //enviar o que?
    }

    public void gravarClientes (String nome, String CPF){
        //tem a finalidade de gravar informações de um cliente
        //porque não criar um objeto e passar como parâmetro?
        //como abaixo
    }

    public void gravarCliente (Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}

}
