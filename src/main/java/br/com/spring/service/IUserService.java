package br.com.spring.service;

import java.util.List;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

public interface IUserService {

	public UserModel save(UserParam param);

	List<UserModel> findsUserByName(UserParam param);		
	
	UserModel update(UserParam param);
	
	void delete (Integer cdUser);

}
