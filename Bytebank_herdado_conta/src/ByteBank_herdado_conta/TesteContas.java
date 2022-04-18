package ByteBank_herdado_conta;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(111, 111);
		//new Conta(222,222);
		cc.depositar(100.0);	
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.depositar(200.0);
		
		cc.transferir(10.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
