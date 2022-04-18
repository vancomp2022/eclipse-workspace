package ByteBankComposto;

public class Conta{
	private double saldo;
	private	int agencia;
	private int numero;
	private Cliente titular;
	private int total;
	
	public Conta (int agencia, int numero) {
		total++;
		System.out.println("o total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}

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
	
	
	public double pegaSaldo() {
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