package br.com.spring.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.UserCrud;
import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserCrud userCrud;

	/**
	 * Metodo responsavel por salvar um usuario
	 */
	@Override
	public UserModel save(UserParam param) {

		UserModel model = new UserModel();
		model.setAge(param.getAge());
		model.setAltura(param.getAltura());
		model.setName(param.getName());
		model.setPeso(param.getPeso());
		model.setDateInput(Calendar.getInstance());

		return userCrud.save(model);

	}

	/**
	 * Metodo responsavel por consultar um usuario
	 */
	@Override
	public UserModel findsUserByName(UserParam param) {

		// TODO Auto-generated method stub
		return userCrud.findByName(param.getName());
	}

	
	public UserModel update(UserParam param){
		
		UserModel model = userCrud.findByCdUser(param.getCdUser());	
		
		model.setAge(param.getAge());
		model.setAltura(param.getAltura());
		model.setDateUpdate(Calendar.getInstance());
		model.setName(param.getName());
		
		userCrud.save(model);
		
		return model;
		
	}

	@Override
	public void delete(Integer cdUser) {
		
		UserModel model = userCrud.findByCdUser(cdUser);		
		
		userCrud.delete(model);
		
		
	}

	

}