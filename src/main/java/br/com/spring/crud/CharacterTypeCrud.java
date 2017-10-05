package br.com.spring.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.model.CharacterTypeModel;

/**
 * Repositorio Tabela UserModel
 * 
 * @author Wilson Martines
 *
 */
@Repository
public interface CharacterTypeCrud extends CrudRepository<CharacterTypeModel, Long> {
	
	public CharacterTypeModel findByIdCharacterType(Integer idCharacterType);

}
