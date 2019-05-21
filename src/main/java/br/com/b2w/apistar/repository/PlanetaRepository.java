package br.com.b2w.apistar.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.b2w.apistar.models.Planeta;


public interface PlanetaRepository extends MongoRepository<Planeta, String> {

	List<Planeta> findByNomeContaining(String nome);
	
}
 