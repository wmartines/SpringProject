package br.com.spring.dao;

import java.util.List;

import br.com.spring.model.ProductModel;
import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;

public interface IProductDao{

    public List<ProductModel> findAllProduct(UserParam param);
}
