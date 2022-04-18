package Package_Program;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta(); 
		Conta contaDaMarcela = new Conta(); 
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.depositar(50);
		contaDaMarcela.depositar(1000);
		if(contaDaMarcela.transferir(3000, contaDoPaulo)) 
			{
			System.out.println("Transferencia feita com sucesso!");
				}
			else {
			System.out.println("Não foi possível realizar a transferência!");	
			}

			
		boolean Result = contaDoPaulo.sacar(30);
		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(Result);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
		
	}

}
