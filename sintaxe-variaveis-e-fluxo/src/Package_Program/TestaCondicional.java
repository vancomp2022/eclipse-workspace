package Package_Program;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
	
		        int mes = 10;

		        switch (mes) {
		            case 1:
		                System.out.println("O m?s ? Janeiro");
		                break;
		            case 2:
		                System.out.println("O m?s ? Fevereiro");
		                break;
		            case 3:
		                System.out.println("O m?s ? Mar?o");
		                break;
		            case 4:
		                System.out.println("O m?s ? Abril");
		                break;
		            case 5:
		                System.out.println("O m?s ? Maio");
		                break;
		            case 6:
		                System.out.println("O m?s ? Junho");
		                break;
		            case 7:
		                System.out.println("O m?s ? Julho");
		                break;
		            case 8:
		                System.out.println("O m?s ? Agosto");
		                break;
		            case 9:
		                System.out.println("O m?s ? Setembro");
		                break;
		            case 10:
		                System.out.println("O m?s ? Outubro");
		                break;
		            case 11:
		                System.out.println("O m?s ? Novembro");
		                break;
		            case 12:
		                System.out.println("O m?s ? Dezembro");
		                break;
		            default:
		                System.out.println("M?s inv?lido");
		                break;
		        }

		// De 1900.0 at? 2800.0 o IR ? de 7.5% e pode deduzir R$ 142
        // De 2800.01 at? 3751.0 o IR ? de 15% e pode deduzir R$ 350
        // De 3751.01 at? 4664.00 o IR ? de 22.5% e pode deduzir R$ 636

        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota ? de 7,5%");
            System.out.println("Voc? pode deduzir at? R$ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota ? de 15%");
            System.out.println("Voc? pode deduzir at? R$ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota ? de 22.5%");
            System.out.println("Voc? pode deduzir at? R$ 636");
        }
		
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("o valor de acompanhado ? = " + acompanhado);
		
	        if(salario < 2600.0) 
	            System.out.println("A sua aliquota ? de 15%");
	            System.out.println("Voc? pode deduzir at? R$ 350");

	        if(salario < 3750.0) 
	            System.out.println("A sua aliquota ? de 22,5%");
	            System.out.println("Voc? pode deduzir at? R$ 636");
		
		if (idade >= 18 && acompanhado) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}
//			else
//		{
//			if (quantidadePessoas >= 2) 
//			System.out.println("voce nao tem 18, mas pode entrar,"
//			+ "pois esta acompanhado");
//		}
			System.out.println("infelizmente voce nao pode entrar");
	}
	


}
