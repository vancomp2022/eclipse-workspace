package Bytebank_herdado;

// Gerente é um funcionario - herda da classe funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Chamando o metodo de bonificação do Designer.");
		return (200);
	}
}
