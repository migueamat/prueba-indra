package es.indra.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.indra.prueba.entity.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Long> {

}
