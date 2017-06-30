package br.com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;
import br.com.spring.presenter.UserPresenter;
import br.com.spring.service.IUserService;


@RestController
public class UserController {

	@Autowired
	private IUserService service;

	/**
	 * Metodo responsavel por consultar um usuario no banco de dados
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<UserPresenter> home(@RequestParam("name")String userName) throws Exception {

		
		UserParam param = new UserParam();
		// Informa parametro recebido para consulta
		param.setName(userName);

		// Efetua consulta no banco de dados e popula o model
		List <UserModel> lsUserModel = service.findsUserByName(param);


		// Converte para presenter
		List<UserPresenter> lspresenter = new ArrayList<>();
		for(UserModel model : lsUserModel){ 
			
		UserPresenter presenter = converToPresenter(model);
		lspresenter.add(presenter);
		
		}

		return lspresenter;
	}

	/**
	 * Metodo responsavel por salvar um usuario no banco de dados
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "user/save", method = RequestMethod.POST)
	public UserModel save(@RequestBody UserParam param) throws Exception {

		// Valida os parametros antes de salvar
		validate(param);

		// Salva parametros no banco de dados
		UserModel result = service.save(param);

		return result;

	}

	/**
	 * Metodo responsavel por atualizar um usuario do banco de dados
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "user/update", method = RequestMethod.PUT)
	public UserPresenter update(@RequestBody UserParam param) throws Exception {

		UserModel model = new UserModel();

		model = service.update(param);		

		validateConsult(model);

		// Converte para presenter
		UserPresenter presenter = converToPresenter(model);

		return presenter;
	}
	
	/**
	 * Metodo responsavel por deletar um usuario
	 * 
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "user/delete/{cdUser}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable Integer cdUser) {
		try {

			service.delete(cdUser);

			return new ResponseEntity<>("SUCESSO", HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>("ERROR", HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * Metodo responsavel por validar parametros antes de salvar no banco
	 * 
	 * @param param
	 * @throws Exception
	 */
	private void validate(UserParam param) throws Exception {

		// Exemplo de usuario bloqueado
		if (param.getName().equals("Wilson")) {

			throw new Exception("Usuario bloqueado");
		}
		// Exemplo menor de idade nao pode fazer cadastro
		if (param.getAge() < 18) {

			throw new Exception("Menor de idade nao permitido");
		}

	}

	/**
	 * Metodo responsavel por validar a consulta no banco de dados
	 * 
	 * @param model
	 * @throws Exception
	 */
	private void validateConsult(UserModel model) throws Exception {

		// se retornar pesquisa nula retorna mensagem
		if (model == null) {

			throw new Exception("Usuário não encontrado !");
		}

	}

	/**
	 * Metodo responsavel por convertar model para presenter
	 * 
	 * @param model
	 * @return
	 */
	private UserPresenter converToPresenter(UserModel model) {

		UserPresenter presenter = new UserPresenter();
		presenter.setName(model.getName());
		presenter.setAge(model.getAge());
		presenter.setAltura(model.getAltura());
		presenter.setPeso(model.getPeso());
		presenter.setId(model.getCdUser());
		presenter.setDateInput(model.getDateInput());

		return presenter;

	}

}
