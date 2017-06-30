package br.com.spring.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;


@Repository
public class UserDao extends AbstractDao implements IUserDao{
	

	public List<UserModel> findAllUser(UserParam param) {

		StringBuilder sql = new StringBuilder();

		sql.append("SELECT u ");
		sql.append("FROM UserModel u ");
		sql.append("WHERE 1=1 ");
		
		if(param.getName() != null){
			sql.append("AND  u.name = :name");
		}
		
		if (param.getAge() != null) {

			sql.append("AND  u.age = :age");

		}
		
		
		Query qry = em.createQuery(sql.toString());
		
		if (param.getName() != null) {
			qry.setParameter("name", param.getName());
		}
		
		if(param.getAge() != null){
			
			qry.setParameter("age", param.getAge());
		}

		return resultList(qry);
	}

}
