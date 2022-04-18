package Bytebank_herdado;

public class FuncionarioTeste {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum; 1 - gerente; 2 - Diretor 
	private int senha; 
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
	} else {
		return false;
	}
}
	
	public FuncionarioTeste() {
		
	}
	
	public double getBonificacao(){
		if (this.tipo == 0) { // 0 - Funcionario comum;
		return this.salario * 0.1;
		}else if (this.tipo == 1) {  // 1 - gerente 
			return this.salario;	
		}else {
			// 2 - diretor
			return this.salario + 1000;
		}
	}	
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
