package br.com.spring.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.UserCrud;
import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

@Service
public class HomeService implements IHomeService {

	@Autowired
	private UserCrud userCrud;

	public UserModel find(UserParam param) {

		return userCrud.findByName(param.getName());

	}

	@Override
	public UserModel save(UserParam param) {

		UserModel model = new UserModel();
		model.setAge(param.getAge());
		model.setAltura(param.getAltura());
		model.setNome(param.getName());
		model.setPeso(param.getPeso());
		model.setDateInput(Calendar.getInstance());

		return userCrud.save(model);

	}

	@Override
	public UserModel findsUser(String userName) {
		
		// TODO Auto-generated method stub
		return userCrud.findByName(userName);
	}

}