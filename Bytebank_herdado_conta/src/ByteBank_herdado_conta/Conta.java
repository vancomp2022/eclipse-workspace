package ByteBank_herdado_conta;
import Javapilha.SaldoInsuficienteException;

public abstract class Conta{
	
	protected double saldo;
	private	int agencia;
	private int numero;
	private Cliente titular;
	private int total;
	
	public Conta() {
		
	}
	
	public Conta (int agencia, int numero) {
		total++;
		//System.out.println("o total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
	}

	public abstract void depositar(double valor);
//	{
//		
//		this.saldo += valor;
//	}
//	
	
	public void sacar(double valor) throws ByteBank_herdado_conta.SaldoInsuficienteException{
		
		if(this.saldo < valor) 
		{
			 throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}else
		{
			this.saldo -= valor;

		}
		
	}
	
	public boolean transferir(double valor, Conta ContaDestino) {
		
		
		if(this.sacar(valor)) 
		{
			ContaDestino.depositar(valor);
			return true;
		}else
		{
			return false;
		}
	
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setNumero(int novoNumero){
		if (novoNumero <= 0) {
			System.out.println("Nao é valido valor negativo");
			return;
		}
		this.numero = novoNumero;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia nao pode conter valor negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}