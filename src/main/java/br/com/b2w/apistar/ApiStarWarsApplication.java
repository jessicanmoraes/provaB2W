package br.com.b2w.apistar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.b2w.apistar.models.Planeta;
import br.com.b2w.apistar.repository.PlanetaRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class ApiStarWarsApplication implements CommandLineRunner {

	@Autowired
	private PlanetaRepository planetrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiStarWarsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Planeta planeta;
		log.info("Procurando Planetas e alguma galáxia");
		log.info("-------------------------------");
		if(planetrepo.count() == 0) {
			planeta = planetrepo.save(new Planeta());
			planetrepo.deleteById(planeta.getId());
		}
	
	}

}
