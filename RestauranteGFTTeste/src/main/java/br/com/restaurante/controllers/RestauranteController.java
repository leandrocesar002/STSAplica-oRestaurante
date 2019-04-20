package br.com.restaurante.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.service.RestauranteService;

@RestController
public class RestauranteController {

	@Autowired
	RestauranteService restauranteservice;
	
	/**
	 * 
	 * @return irá retornar todos os restaurantes cadastrados usando o /restaurantes na aba de pesquisa
	 */
	@GetMapping("/restaurantes")
	private List<Restaurante> getAllRestaurantes(){
		return restauranteservice.getAllRestaurantes();
	}
	
	/**
	 * 
	 * @param id é a chave primaria de cada restaurante criado
	 * @return ele irá retornar o restaurante(nome e id) correspondente ao id econtrado no banco de dados*
	 */
	@GetMapping("/restaurantes/{id}")
	private Restaurante getRestaurante(@PathVariable("id")int id) {
		return restauranteservice.getRestauranteById(id);
	}
	/**
	 * 
	 * @param id é a chave primaria de cada restaurante criado
	 */
	@DeleteMapping("/restaurantes/{id}")
	private void deleteRestaurante(@PathVariable("id")int id) {
		restauranteservice.delete(id);

	}	
	/**
	 * 
	 * @param restaurante irá passar o restaurante como parametro caso exista para aplicar a alteração
	 * @return um novo restaurante criado ou uma alteração aplicada a um restaurante existente
	 */
	@PostMapping("/restaurantes")
	private int saveRestaurante(@RequestBody Restaurante restaurante) {
		restauranteservice.saveOrUpdate(restaurante);
		return restaurante.getId();
	}
}
