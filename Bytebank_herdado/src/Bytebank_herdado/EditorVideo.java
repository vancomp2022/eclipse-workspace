package Bytebank_herdado;

// Gerente � um funcionario - herda da classe funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Chamando o metodo de bonifica��o do Editor de Video.");
		return (100);
	}
}
