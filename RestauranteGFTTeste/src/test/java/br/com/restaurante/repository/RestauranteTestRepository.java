package br.com.restaurante.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.restaurante.entity.Restaurante;
import br.com.restaurante.repository.RestauranteRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestauranteTestRepository {
	
	@Autowired
	private RestauranteRepository res;
	
	@Test
	public void testaID() {
		Optional<Restaurante> restaurante = res.findById(1);
		assertThat(restaurante.get().getNome().equals("China in box"));
		
	}
	
	

	
}
