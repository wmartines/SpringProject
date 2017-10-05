package br.com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.CharacterTypeCrud;
import br.com.spring.model.CharacterTypeModel;
import br.com.spring.param.CharacterParam;

@Service
public class ChacacterTypeService implements ICharacterTypeService{
	
	@Autowired
	private CharacterTypeCrud crud;
	
	@Override
	public CharacterTypeModel findCharacterTypeById(CharacterParam param) {
		
		CharacterTypeModel model = crud.findByIdCharacterType(param.getCharacterType());	
		
		return model;
	}
	
	

}
