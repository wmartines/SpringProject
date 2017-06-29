package br.com.spring.param;

public class UserParam {

	private String name;
	
	private int age;
	
	private double peso;
	
	private double altura;

	@Override
	public String toString() {
		return "HomeParam [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
