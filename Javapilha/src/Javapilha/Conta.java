package Javapilha;

public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	String CPF;
	String profissao;
	
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	
	public void sacar(double valor){
		
		if(this.saldo < valor) 
		{
			 throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}else
		{
			this.saldo -= valor;

		}
		
	}
	
	public void transferir(double valor, Conta ContaDestino) {
		throws SaldoInsuficienteException{
		    this.saca(valor);
		    destino.deposita(valor);
		}
	
}