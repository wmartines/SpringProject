package br.com.spring.param;


public class UserParam {

	private String name;
	
	private Integer age;
	
	private Double peso;
	
	private Double altura;
	
	private Integer cdUser;

	@Override
	public String toString() {
		return "HomeParam [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String userName) {
		this.name = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getCdUser() {
		return cdUser;
	}

	public void setCdUser(Integer cdUser) {
		this.cdUser = cdUser;
	}
	
}
