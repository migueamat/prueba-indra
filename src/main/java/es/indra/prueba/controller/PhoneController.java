package es.indra.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.indra.prueba.entity.Phone;
import es.indra.prueba.service.PhoneServiceImpl;

@Controller
@RequestMapping("phones")
public class PhoneController {
	
	@Autowired
	PhoneServiceImpl phoneService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Iterable<Phone>> getPhones() {
		
		Iterable<Phone> phoneList = phoneService.getPhones();
		
		if(phoneList.iterator().next() == null) {
			return new ResponseEntity<Iterable<Phone>>(phoneList, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Iterable<Phone>>(phoneList, HttpStatus.OK);
	}

}
