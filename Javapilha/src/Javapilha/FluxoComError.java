package Javapilha;

public class FluxoComError {
	public static void main(String[] args) {
		System.out.println("Ini do main");

		try {
		metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
		String msg = ex.getMessage();
		System.out.println("Exception" + msg);
		ex.printStackTrace();	
		} 
		System.out.println("Fim do main");
		
        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(nome);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }

        System.out.println("DEPOIS");
	}
		
	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
			metodo2();		
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
	    System.out.println("Ini do metodo2");
	    metodo2();	
	    System.out.println("Fim do metodo2");
	}
}
	




