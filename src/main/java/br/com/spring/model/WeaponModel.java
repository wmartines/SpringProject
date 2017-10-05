package br.com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WEAPON")
public class WeaponModel implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8635149148572862299L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_WEAPON")
	private Integer cdWeapon;
	
	/**
	 *Nome da arma
	 */
	@Column(name = "NAME")
	private String weaponName;
	
	/**
	 * Força de ataque da arma
	 */
	@Column(name = "POWER")
	private Integer weaponPower;
	
	/**
	 * Força de defesa da arma
	 */
	@Column(name = "DEFENSE")
	private Integer weaponDefense;

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public Integer getWeaponPower() {
		return weaponPower;
	}

	public void setWeaponPower(Integer weaponPower) {
		this.weaponPower = weaponPower;
	}

	public Integer getWeaponDefense() {
		return weaponDefense;
	}

	public void setWeaponDefense(Integer weaponDefense) {
		this.weaponDefense = weaponDefense;
	}

}
