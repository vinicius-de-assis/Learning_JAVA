package br.com.meuprojeto;

public class conta {
	
	String cliente;
	double saldo;

	void exibesaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void saque(double valor) { // funcao saque recebe um valor
		saldo -= valor; // -= --> subtrai esse valor do saldo
	}
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	void transferencia_valor(conta destino, double valor) {
		this.saque(valor);
		destino.deposita(valor);
	}
}
