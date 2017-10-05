package br.com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHAR_PARAM")
public class CharacterModel implements Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8736872120072147274L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CD_CHAR")
	private Integer cdChar;
	
	/**
	 *Nome do personagem 
	 */
	@Column(name = "name")
	private String characterName;
	
	/**
	 * Quantidade de vida do personagem
	 */
	@Column(name = "LIFE")
	private Integer life;
	
	/**
	 * Força de ataque do personagem
	 */
	@Column(name = "POWER")
	private Integer power;
	
	/**
	 * Defesa do personagem
	 */
	@Column(name = "DEFENSE")
	private Integer defense;	

	/**
	 * Tipo de raça do personagem
	 */
	@Column(name = "CHAR_TYPE")
	private Integer characterType;	
	
	public Integer getCdChar() {
		return cdChar;
	}

	public void setCdChar(Integer cdChar) {
		this.cdChar = cdChar;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getCharacterType() {
		return characterType;
	}

	public void setCharacterType(Integer characterType) {
		this.characterType = characterType;
	}
}
