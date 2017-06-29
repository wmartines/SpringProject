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
		model.setNome(param.getName());
		model.setPeso(param.getPeso());
		model.setDateInput(Calendar.getInstance());

		return userCrud.save(model);

	}

	/**
	 * Metodo responsavel por consultar um usuario
	 */
	@Override
	public UserModel findsUser(UserParam param) {

		// TODO Auto-generated method stub
		return userCrud.findByName(param.getName());
	}

	@Override
	public UserModel deleteUser(UserModel model) {
		
		
		userCrud.delete(model.getNome());	 
		
		return userCrud.findByName(param.getName());
		 
		
		 
	}

}