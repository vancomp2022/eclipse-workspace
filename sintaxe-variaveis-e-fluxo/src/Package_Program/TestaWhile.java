package Package_Program;

public class TestaWhile {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		for (numero = 0; numero <= 20; numero++) {
		if(numero % 3 == 0) {
			System.out.println(numero);
			}
		}
		
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total += contador;
			System.out.println(total);
			contador++;
		}
		
		
		
		for(int cont = 0; cont <=10; cont++  ) {
			System.out.println(cont);
		}
	
	
	
	for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int cont1 = 1; cont1 <= 10; cont1++) {
				System.out.print(multiplicador * cont1);
				System.out.print(" ");
		}
			System.out.println();
	}
	
	
	
	for(int linha = 0; linha < 10; linha++) {
		for(int coluna = 0; coluna <= linha; coluna++) {
			System.out.print("*");
	}
		System.out.println();
}
}

}