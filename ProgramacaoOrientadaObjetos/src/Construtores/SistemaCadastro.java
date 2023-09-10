package Construtores;
public class SistemaCadastro {
	public static void main(String[] args) {
		//assim que criamos uma nova pessoa, é necessário informar cpf e nome
		Pessoa marcos = new Pessoa("123", "MARCOS");
		
		//definimos o endereço de marcos
        //que podeser atribuido posteriormente
		marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
