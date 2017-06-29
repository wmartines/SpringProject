package br.com.spring.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;


@Repository
public class UserDao {
	
	   public UserModel findUsers(UserParam param) {
		   UserModel model  = null;
		   Query qry = null;
		   
		   return model;
	   }

}
