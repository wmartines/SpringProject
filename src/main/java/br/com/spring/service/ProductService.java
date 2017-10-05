package br.com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.crud.ProductCrud;
import br.com.spring.model.ProductModel;
import br.com.spring.model.UserModel;
import br.com.spring.param.ProductParam;
import br.com.spring.param.UserParam;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductCrud userCrud;

	@Override
	public ProductModel save(ProductParam param) {

		ProductModel model = new ProductModel();

		model.setName(param.getName());
		model.setPrice(param.getPrice());
		model.setStatus(param.getStatus());

		return userCrud.save(model);
	}

	@Override
	public List<ProductModel> findProductByName(ProductParam param) {
		
		return null;
		
		
	}

	@Override
	public List<ProductModel> findProductByStatus(ProductParam param) {
		List<ProductModel> result;
		
		result = userCrud.findByStatus(param.getStatus());
		return result;
	}

	@Override
	public ProductModel update(ProductParam param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer cdProduct) {
		// TODO Auto-generated method stub
		
	}

	

}