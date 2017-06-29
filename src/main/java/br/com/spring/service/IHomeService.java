package br.com.spring.service;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

public interface IHomeService {

	public UserModel save(UserParam param);
	
	public String find(String param);
}
