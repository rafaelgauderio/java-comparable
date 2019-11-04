package entidades;

public class Empregado implements Comparable<Empregado>{
	private String nome;
	private Double salary;
	public Empregado(String nome, Double salary) {
		this.nome = nome;
		this.salary = salary;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Empregado outro) {
		// TODO Auto-generated method stub
		// menos na frente faz retornar na ordem decrescente
		return - salary.compareTo(outro.getSalary());
	}
	
	
	

}
