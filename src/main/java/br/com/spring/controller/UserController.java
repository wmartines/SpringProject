package br.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public UserPresenter home(@RequestParam("name") String userName) throws Exception {
		
		UserModel model = new UserModel();
		UserParam param = new UserParam();
		// Informa parametro recebido para consulta
		param.setName(userName);

		// Efetua consulta no banco de dados e popula o model
		model = service.findsUser(param);

		// Valida os resultados da pesquisa
		validateConsult(model);

		// Converte para presenter
		UserPresenter presenter = converToPresenter(model);

		return presenter;
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
	 * Metodo responsavel por deletar um usuario do banco de dados
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "user/delete" )
	public UserPresenter delete(@RequestParam("name") String userName){

		UserModel model = new UserModel();
		UserParam param = new UserParam();
		param.setName(userName);

		model = service.deleteUser(param);
		
		// Converte para presenter
		UserPresenter presenter = converToPresenter(model);

		return presenter;
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
	
	public String validateDelete(UserModel model){
		
		String delete = null;
		
		if (model == null){
			
			delete = "Usuario Deletado com sucesso !";
		}
		
		return delete;
	}

	/**
	 * Metodo responsavel por convertar model para presenter
	 * 
	 * @param model
	 * @return
	 */
	private UserPresenter converToPresenter(UserModel model) {

		UserPresenter presenter = new UserPresenter();
		presenter.setName(model.getNome());
		presenter.setAge(model.getAge());
		presenter.setAltura(model.getAltura());
		presenter.setPeso(model.getPeso());
		presenter.setId(model.getId());
		presenter.setDateInput(model.getDateInput());

		return presenter;

	}

}
