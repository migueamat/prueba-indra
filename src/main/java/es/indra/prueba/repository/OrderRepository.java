package es.indra.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.indra.prueba.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
