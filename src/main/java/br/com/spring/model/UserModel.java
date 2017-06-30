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

/**
 * @author as
 *
 */
@Entity
@Table(name = "USER")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_USER")
	private Integer cdUser;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;
	@Column(name = "WEIGHT")
	private double peso;

	@Column(name = "HEIGHT")
	private double altura;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Calendar dateInput;

	public Integer getCdUser() {
		return cdUser;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "updateDate")
	private Calendar dateUpdate;	
	

	public Calendar getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Calendar dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public void setCdUser(Integer id) {
		this.cdUser = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
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
