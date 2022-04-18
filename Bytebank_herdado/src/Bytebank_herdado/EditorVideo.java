package Bytebank_herdado;

// Gerente é um funcionario - herda da classe funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Chamando o metodo de bonificação do Editor de Video.");
		return (100);
	}
}
