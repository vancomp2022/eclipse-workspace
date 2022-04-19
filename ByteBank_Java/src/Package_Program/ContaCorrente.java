package Package_Program;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
	    double valorASacar = valor + 0.2;
	    super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor; 
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
}
