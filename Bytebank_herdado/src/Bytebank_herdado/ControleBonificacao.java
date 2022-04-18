package Bytebank_herdado;
public class ControleBonificacao {
	
	private double soma;

	/*public void Registra(Gerente g) {
		// TODO Auto-generated method stub
		double boni = g.getBonificacao();
		this.soma += boni;
	}*/
	
	public void Registra(Funcionario f) {
		// TODO Auto-generated method stub
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	/*public void Registra(EditorVideo ev) {
		// TODO Auto-generated method stub
		double boni = ev.getBonificacao();
		this.soma += boni;
	}*/
	
	public double getSoma() {
		return soma;
		
	}

}
