package ByteBank_herdado_conta;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
}
