package Package_Program;

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
	
	
	public boolean sacar(double valor){
		
		if(this.saldo < valor) 
		{
			return false;
		}else
		{
			this.saldo -= valor;
			return true;
		}
		
	}
	
	public boolean transferir(double valor, Conta ContaDestino) {
		
		
		if(this.saldo < valor) 
		{
			return false;
		}else
		{
			this.saldo -= valor;
			ContaDestino.depositar(valor); 
			return true;
		}
		
	}
	
}