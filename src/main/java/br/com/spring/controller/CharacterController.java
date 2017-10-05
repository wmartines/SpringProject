package br.com.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.model.CharacterModel;
import br.com.spring.param.CharacterParam;
import br.com.spring.presenter.CharacterPresenter;
import br.com.spring.service.ChacacterService;
import br.com.spring.type.CharacterType;

@RestController
@RequestMapping(value = "character/")
public class CharacterController {
	
	@Autowired
	private ChacacterService service;
		
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ResponseEntity<?> list(@RequestParam("characterName") Optional<String> characterName){
		
		
		
		CharacterParam param = new CharacterParam();
		param.setCharacterName(characterName.orElse(null));
		List<CharacterModel> lsmodel = 	service.findChacacterByName(param);
		List<CharacterPresenter> lsPresenter  = new ArrayList<>();
		
		for (CharacterModel model : lsmodel) {
			
			lsPresenter.add(convertToPresenter(model));
		}
		
		  return new ResponseEntity<List<CharacterPresenter>>(lsPresenter, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody CharacterParam param) {

		service.save(param);

		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public void update(){
		
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public void delete(){
		
	}
	/**
	 * Metodo responsavel por converter para presenter
	 * @param model
	 * @return
	 */
	public CharacterPresenter convertToPresenter(CharacterModel model){
		
		CharacterPresenter presenter = new CharacterPresenter();
		presenter.setCharacterName(model.getCharacterName());
		presenter.setCharacterType(CharacterType.getById(model.getCharacterType()));
		presenter.setDefense(model.getDefense());
		presenter.setPower(model.getPower());
		presenter.setLife(model.getLife());
		
		
		return presenter;
	}
	
}
