package ByteBankComposto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		Conta contaDoPaulo = new Conta();
		
		paulo.nome = "Paulo Silveira";
		paulo.CPF = "222.222.222-55";
		paulo.profissao = "programador";
		
		contaDoPaulo.depositar(100);
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		
		
		
	}

}
