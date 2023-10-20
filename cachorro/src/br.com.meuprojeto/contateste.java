package br.com.meuprojeto;

public class contateste {

	public static void main(String[] args) {
		
		conta conta1 = new conta();
		conta1.cliente = "Vinicius";
		conta1.saldo = 4_000.00;
		conta1.exibesaldo();
		
		
		//Quero ver a transferencia_valor, logo comento as outras chamadas de função
		//conta1.saque(2000); //chamada da funcao levando 2000 --> 2000 seria o valor que foi sacado
		//conta1.exibesaldo();

		//conta1.deposito(5000); //chama funcao depoisto levando 5000
		//conta1.exibesaldo();
		
		conta destino = new conta(); //aqui eu criei um novo objeto conta chamado destino
		destino.cliente = "Carlos";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
	}

}
