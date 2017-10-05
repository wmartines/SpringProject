package br.com.spring.dao;

import java.util.List;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

public interface ICharacterDao{

    public List<UserModel> findAllUser(UserParam param);
}
