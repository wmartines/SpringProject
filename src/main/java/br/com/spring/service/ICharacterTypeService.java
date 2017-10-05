package br.com.spring.service;

import br.com.spring.model.CharacterTypeModel;
import br.com.spring.param.CharacterParam;

public interface ICharacterTypeService {

	CharacterTypeModel findCharacterTypeById(CharacterParam param);

}
