public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;
        // TODO: conhecer e importar a classe scanner

        // exibir as mensagens para o nosso usuário

        // obter pela classe scanner os valores digitados no terminal

        // exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
};