package br.com.spring.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.model.UserModel;


@Repository
public interface UserCrud extends CrudRepository<UserModel,Long> {

	
	public UserModel findByName(String name);

}
