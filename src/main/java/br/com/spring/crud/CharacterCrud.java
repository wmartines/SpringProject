package br.com.spring.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.model.CharacterModel;

/**
 * Repositorio Tabela UserModel
 * 
 * @author Wilson Martines
 *
 */
@Repository
public interface CharacterCrud extends CrudRepository<CharacterModel, Long> {

	 List<CharacterModel> findByCharacterName(String characterName);
	
	 CharacterModel findByCdChar(Integer cdChar);

}
