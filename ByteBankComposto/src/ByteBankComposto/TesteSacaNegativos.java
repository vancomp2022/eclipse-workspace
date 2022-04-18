package ByteBankComposto;

public class TesteSacaNegativos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(100);
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.sacar(200));
			
		System.out.println(conta.pegaSaldo());
		
	}

}
