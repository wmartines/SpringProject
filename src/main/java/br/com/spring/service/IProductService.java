package br.com.spring.service;

import java.util.List;

import br.com.spring.model.ProductModel;
import br.com.spring.param.ProductParam;

public interface IProductService {

	public ProductModel save(ProductParam param);

	List<ProductModel> findProductByName(ProductParam param);
	
	List<ProductModel> findProductByStatus(ProductParam param);
	
	ProductModel update(ProductParam param);
	
	void delete (Integer cdProduct);

}
