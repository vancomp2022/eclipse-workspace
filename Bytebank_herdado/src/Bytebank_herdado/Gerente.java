package Bytebank_herdado;

// Gerente é um Funcionario - herda da classe funcionario
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private AutenticacaoUtil autenticador; 
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public double getBonificacao(){
		System.out.println("Chamado o metodo de bonificação do GERENTE");
		return super.getSalario();
	}	
	
}
