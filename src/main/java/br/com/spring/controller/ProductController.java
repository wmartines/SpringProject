package br.com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.model.ProductModel;
import br.com.spring.param.ProductParam;
import br.com.spring.presenter.ProductPresenter;
import br.com.spring.service.IProductService;


@RestController
public class ProductController {

	@Autowired
	private IProductService service;
	
	
	/**
	 * Metodo responsavel por salvar um usuario no banco de dados
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "product/save", method = RequestMethod.POST)
	public ProductModel save(@RequestBody ProductParam param) throws Exception {

		// Salva parametros no banco de dados
		ProductModel result = service.save(param);

		return result;

	}
	
	@RequestMapping(value = "product/list", method = RequestMethod.GET)
	public List<ProductPresenter> productList(@RequestParam("status")Boolean status){
		
		ProductParam param = new ProductParam();
		List<ProductPresenter> result = new ArrayList<>();
		param.setStatus(status);
		
		List<ProductModel> lsmodel = service.findProductByStatus(param);
				
		for (ProductModel model : lsmodel) {
			
			ProductPresenter presenter = convertToPresenter(model);
			result.add(presenter);
		}
		
		return result;
		
		
	}
	
	private ProductPresenter convertToPresenter(ProductModel model){
	
		ProductPresenter presenter = new ProductPresenter();
		
		presenter.setName(model.getName());
		presenter.setPrice(model.getPrice());
		presenter.setStatus(model.getStatus());		
		
		return presenter;		
		
	}

	
}
