package br.com.spring.service;

import java.util.List;

import br.com.spring.model.CharacterModel;
import br.com.spring.param.CharacterParam;

public interface IChacacterService {
	
	public CharacterModel save(CharacterParam param);
	
	List<CharacterModel> findChacacterByName(CharacterParam param);
	
	public void insertWeapon(CharacterModel model);
	
	public CharacterModel update(CharacterParam param);
	
	public void delete(CharacterParam param);

}
