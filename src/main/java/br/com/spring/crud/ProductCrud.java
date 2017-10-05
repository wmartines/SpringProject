package br.com.spring.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.model.ProductModel;

/**
 * Repositorio Tabela UserModel
 * 
 * @author Wilson Martines
 *
 */
@Repository
public interface ProductCrud extends CrudRepository<ProductModel, Long> {

	public ProductModel findByName(String name);
	
	public ProductModel findByCdProduct(Integer cdProduct);
	
	public List<ProductModel> findByStatus(Boolean status);

}
