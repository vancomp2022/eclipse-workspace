package Bytebank_herdado;

// Gerente � um funcionario - herda da classe funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Chamando o metodo de bonifica��o do Designer.");
		return (200);
	}
}
