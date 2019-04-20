package br.com.restaurante.repository;
/**
 * 
 */
import org.springframework.data.repository.CrudRepository;

import br.com.restaurante.entity.Restaurante;

public interface RestauranteRepository extends CrudRepository<Restaurante, Integer> {

	
}
