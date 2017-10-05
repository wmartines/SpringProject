package br.com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.CharacterCrud;
import br.com.spring.model.CharacterModel;
import br.com.spring.model.CharacterTypeModel;
import br.com.spring.param.CharacterParam;
import br.com.spring.utils.SpringUtils;

@Service
public class ChacacterService implements IChacacterService{
	
	@Autowired
	private CharacterCrud crud;
	@Autowired
	private ChacacterTypeService characterTypeService;

	@Override
	public CharacterModel save(CharacterParam param) {
		
		CharacterModel model = new CharacterModel();
		CharacterParam completeParam = setAtributes(param);
		
		model.setCharacterName(completeParam.getCharacterName());
		model.setCharacterType(completeParam.getCharacterType());
		model.setDefense(completeParam.getDefense());
		model.setLife(completeParam.getLife());
		model.setPower(completeParam.getPower());
		
		crud.save(model);
		
		return model;
	}

	@Override
	public List<CharacterModel> findChacacterByName(CharacterParam param) {
		
		List<CharacterModel> lsmodel = crud.findByCharacterName(param.getCharacterName());
		
		return lsmodel;
	}

	@Override
	public CharacterModel update(CharacterParam param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(CharacterParam param) {
		
		
	}
	
	/**
	 * Metodo responsavel por atribuir atributos automaticos de acordo com cada personagem
	 * @param param
	 * @return
	 */
	public CharacterParam setAtributes(CharacterParam param){
		
		CharacterTypeModel characterTypeModel = characterTypeService.findCharacterTypeById(param);
		
		CharacterParam atributes = new CharacterParam();
		atributes.setCharacterName(param.getCharacterName());
		atributes.setCharacterType(param.getCharacterType());
		atributes.setDefense(SpringUtils.generateRandomValues(characterTypeModel.getMaxDefense()));
		atributes.setLife(SpringUtils.generateRandomValues(characterTypeModel.getMaxLife()));
		atributes.setPower(SpringUtils.generateRandomValues(characterTypeModel.getMaxPower()));
		
		return atributes;
	}

	@Override
	public void insertWeapon(CharacterModel model) {
		// TODO Auto-generated method stub
		
	}

}
