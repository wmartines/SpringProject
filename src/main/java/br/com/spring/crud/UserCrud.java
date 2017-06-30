package br.com.spring.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.model.UserModel;

/**
 * Repositorio Tabela UserModel
 * 
 * @author Wilson Martines
 *
 */
@Repository
public interface UserCrud extends CrudRepository<UserModel, Long> {

	public UserModel findByName(String name);
	
	public UserModel findByCdUser(Integer cdUser);

}
