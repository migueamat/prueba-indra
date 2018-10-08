package es.indra.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.prueba.entity.Phone;
import es.indra.prueba.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService {
	
	@Autowired
	PhoneRepository phoneRepository;

	@Override
	public Iterable<Phone> getPhones() {
		return phoneRepository.findAll();
	}
	

}
