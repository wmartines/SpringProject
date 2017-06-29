package br.com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.model.UserModel;
import br.com.spring.param.UserParam;
import br.com.spring.service.IHomeService;

@RestController
public class UserController {

	@Autowired
	private IHomeService service;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String home(@RequestParam("name") String param) {

		String result = service.find(param);

		return result;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public UserModel save(@RequestBody UserParam param) throws Exception {

		validate(param);

		UserModel result = service.save(param);

		return result;

	}

	private void validate(UserParam param) throws Exception {

		if (param.getName().equals("Wilson")) {
			throw new Exception("Usuario bloqueado");
		}
		if (param.getAge() < 18) {

			throw new Exception("Menor de idade nao permitido");
		}

	}

}
