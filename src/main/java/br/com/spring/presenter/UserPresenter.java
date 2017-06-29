package br.com.spring.presenter;

import java.util.Calendar;

public class UserPresenter {

	private String name;
	
	private int age;
	
	private double peso;
	
	private double altura;
	
	private Integer id;
	
	private Calendar dateInput;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Calendar getDateInput() {
		return dateInput;
	}

	public void setDateInput(Calendar dateInput) {
		this.dateInput = dateInput;
	}
	
	
}
