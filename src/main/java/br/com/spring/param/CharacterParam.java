package br.com.spring.param;

import br.com.spring.type.CharacterType;

public class CharacterParam {

	/**
	 * Tipo de raça do personagem
	 */	
	private Integer characterType;

	/**
	 *Nome do personagem 
	 */	
	private String characterName;
	
	/**
	 * Quantidade de vida do personagem
	 */	
	private Integer life;
	
	/**
	 * Força de ataque do personagem
	 */	
	private Integer power;
	
	/**
	 * Defesa do personagem
	 */
	private Integer defense;
	
	/**
	 * Arma do personagem
	 */
	private Integer cdWeapon;
	

	public Integer getCharacterType() {
		return characterType;
	}

	public void setCharacterType(Integer characterType) {
		this.characterType = characterType;
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

	public Integer getCdWeapon() {
		return cdWeapon;
	}

	public void setCdWeapon(Integer cdWeapon) {
		this.cdWeapon = cdWeapon;
	}	
}
