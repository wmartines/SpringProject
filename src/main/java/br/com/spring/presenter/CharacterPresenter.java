package br.com.spring.presenter;

import br.com.spring.type.CharacterType;

public class CharacterPresenter {

	/**
	 * Tipo de raça do personagem
	 */
	private CharacterType characterType;

	/**
	 * Nome do personagem
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
	
	/**
	 * Pontos de ataque da arma
	 */
	private Integer weaponPower;
	
	/**
	 * Pontos de defesa da arma
	 */
	private Integer weaponDefense;
	
	/**
	 * 
	 * Pontos de ataque total
	 */
	private Integer totalPower;
	
	/**
	 * Pontos de defesa total
	 */
	private Integer totalDefense;

	public CharacterType getCharacterType() {
		return characterType;
	}

	public void setCharacterType(CharacterType characterType) {
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

	public Integer getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(Integer totalPower) {
		this.totalPower = totalPower;
	}

	public Integer getTotalDefense() {
		return totalDefense;
	}

	public void setTotalDefense(Integer totalDefense) {
		this.totalDefense = totalDefense;
	}
	
}
