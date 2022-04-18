package Bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
//		Gerente g = new Gerente();
//		g.setSenha(2222);
//		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente(); 
		cliente.setSenha(2222);
////		Designer d = new Designer();
////		d.setSenha(5555);
//		
		SistemaInterno si = new SistemaInterno();
		//si.autentica(g);
		si.autentica(adm);
 		//si.autentica(d);
 		si.autentica(cliente);
		
	}

}
