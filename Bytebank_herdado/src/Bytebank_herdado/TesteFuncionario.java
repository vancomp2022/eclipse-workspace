	package Bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		//cliente.setSalario(3000.0);
		
		Gerente nico = new Gerente();
		nico.setNome("Nico"); 
		nico.setCpf("123.456.789-99");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
}
