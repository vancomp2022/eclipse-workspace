package Bytebank_herdado;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionarioTeste f1 = new FuncionarioTeste();
		FuncionarioTeste f2 = new FuncionarioTeste();
		
		f1.setSalario(3000.0);
		f2.setTipo(2);
		f2.setSalario(5000.0);
		System.out.println(f1.getTipo());
		System.out.println(f2.getTipo());
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		
	}

}
