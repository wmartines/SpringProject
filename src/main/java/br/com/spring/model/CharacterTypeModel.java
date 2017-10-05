package br.com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTER_TYPE")
public class CharacterTypeModel implements Serializable {	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4604103860802562520L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCHARACTER_TYPE")
	private Integer idCharacterType;
	
	/**
	 *Tipo de personagem
	 */
	@Column(name = "CHARACTER_TYPE")
	private String characterType;
	
	/**
	 * Maximo ponto de vida
	 */
	@Column(name = "MAX_LIFE")
	private Integer maxLife;
	
	/**
	 * Maximo ponto ataque
	 */
	@Column(name = "MAX_POWER")
	private Integer maxPower;
	
	/**
	 * Maximo ponto ataque
	 */
	@Column(name = "MAX_DEFENSE")
	private Integer maxDefense;	

	public Integer getIdCharacterType() {
		return idCharacterType;
	}

	public void setIdCharacterType(Integer idCharacterType) {
		this.idCharacterType = idCharacterType;
	}

	public Integer getMaxDefense() {
		return maxDefense;
	}

	public void setMaxDefense(Integer maxDefense) {
		this.maxDefense = maxDefense;
	}

	public String getCharacterType() {
		return characterType;
	}

	public void setCharacterType(String characterType) {
		this.characterType = characterType;
	}

	public Integer getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(Integer maxLife) {
		this.maxLife = maxLife;
	}

	public Integer getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(Integer maxPower) {
		this.maxPower = maxPower;
	}
}
