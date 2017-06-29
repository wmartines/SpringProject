package br.com.spring.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_USER")
	private Integer id;

	@Column(name = "NAME")
	private String nome;

	@Column(name = "AGE")
	private int age;
	@Column(name = "WEIGHT")
	private double peso;

	@Column(name = "HEIGHT")
	private double altura;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Calendar dateInput;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Calendar getDateInput() {
		return dateInput;
	}

	public void setDateInput(Calendar dateInput) {
		this.dateInput = dateInput;
	}

}
