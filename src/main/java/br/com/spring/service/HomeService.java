package br.com.spring.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.UserCrud;
import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;





@Service
public class HomeService implements IHomeService {
	

	
	@Autowired
	private UserCrud userCrud;
	
	
	public List<UserModel> find(UserParam param){
		
		
		
		List<UserModel> names =	(List<UserModel>) userCrud.findByName(param.getName());
		
		
		return names;
		
		
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
	public String find(String param) {
		// TODO Auto-generated method stub
		return null;
	}
	
}