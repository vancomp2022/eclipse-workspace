package Bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		String nome = g1.getNome();
		g1.setSalario(5000);
		g1.autentica(2222);
		
		//f.setSalario(2000);
		ControleBonificacao controle = new ControleBonificacao();
			
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		controle.Registra(g1);
		controle.Registra(ev);
		controle.Registra(d);
			
		System.out.println(nome);
		System.out.println(controle.getSoma());
	}

}
