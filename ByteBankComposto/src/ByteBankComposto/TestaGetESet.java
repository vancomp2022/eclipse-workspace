package ByteBankComposto;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Cliente paulo = new Cliente();
		
		conta.setNumero(1337);
		
		conta.setTitular(paulo);
		
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular().getNome());
		
		
		conta.getTitular().setProfissao("Desenvolvedor");
		
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
