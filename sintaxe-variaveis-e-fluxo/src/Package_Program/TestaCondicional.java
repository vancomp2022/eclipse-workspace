package Package_Program;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
	
		        int mes = 10;

		        switch (mes) {
		            case 1:
		                System.out.println("O mês é Janeiro");
		                break;
		            case 2:
		                System.out.println("O mês é Fevereiro");
		                break;
		            case 3:
		                System.out.println("O mês é Março");
		                break;
		            case 4:
		                System.out.println("O mês é Abril");
		                break;
		            case 5:
		                System.out.println("O mês é Maio");
		                break;
		            case 6:
		                System.out.println("O mês é Junho");
		                break;
		            case 7:
		                System.out.println("O mês é Julho");
		                break;
		            case 8:
		                System.out.println("O mês é Agosto");
		                break;
		            case 9:
		                System.out.println("O mês é Setembro");
		                break;
		            case 10:
		                System.out.println("O mês é Outubro");
		                break;
		            case 11:
		                System.out.println("O mês é Novembro");
		                break;
		            case 12:
		                System.out.println("O mês é Dezembro");
		                break;
		            default:
		                System.out.println("Mês inválido");
		                break;
		        }

		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
        }
		
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("o valor de acompanhado é = " + acompanhado);
		
	        if(salario < 2600.0) 
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir até R$ 350");

	        if(salario < 3750.0) 
	            System.out.println("A sua aliquota é de 22,5%");
	            System.out.println("Você pode deduzir até R$ 636");
		
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
