package Bytebank_herdado;

public class AutenticacaoUtil implements Autenticavel{

	private int senha; 
	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		if (this.senha == senha) {
			return true; 
		}else {
		return false;
	}

	}
}