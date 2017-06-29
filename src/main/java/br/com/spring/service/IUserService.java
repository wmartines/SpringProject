package br.com.spring.service;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

public interface IUserService {

	public UserModel save(UserParam param);

	UserModel findsUser(UserParam param);
	
	UserModel deleteUser(UserModel model);
}
