package br.com.restaurante.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.repository.RestauranteRepository;

@Service
public class RestauranteService {
	
	 @Autowired
	    RestauranteRepository restauranteRepository;

	 /**
	  * 
	  * @return irá retornar todos os restaurantes cadastrados no banco de dados
	  */
	    public List<Restaurante> getAllRestaurantes() {
	        List<Restaurante> Restaurantes = new ArrayList<Restaurante>();
	        restauranteRepository.findAll().forEach(Restaurante -> Restaurantes.add(Restaurante));
	        return Restaurantes;
	    }
	    
	    /**
	     * 
	     * @param id
	     * @return retornara o nome e o codigo restaurante correspondente ao id
	     */
	    public Restaurante getRestauranteById(int id) {
	        return restauranteRepository.findById(id).get();
	    }

	    /**
	     * 
	     * @param restaurante irá passar o restaurante como parametro caso exista para aplicar a alteração
	     */
	    public void saveOrUpdate(Restaurante Restaurante) {
	        restauranteRepository.save(Restaurante);
	    }

	    /**
	     * 
	     * @param id chave primaria do restaurante será passada como parametro para deletar
	     */
	    public void delete(int id) {
	        restauranteRepository.deleteById(id);
	    }
}
