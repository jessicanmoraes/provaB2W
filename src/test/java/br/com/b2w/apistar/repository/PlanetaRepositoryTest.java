package br.com.b2w.apistar.repository;

import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.b2w.apistar.models.Planeta;
import br.com.b2w.apistar.repository.PlanetaRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class PlanetaRepositoryTest {

	Planeta planeta1, planeta2;
    
	@Autowired
    PlanetaRepository repository;
    
    @Before
    public void setUp() {
        
    	planeta1 = repository.save(new Planeta("Coruscant", "teste","teste"));
        planeta2 = repository.save(new Planeta("Dagobah", "teste","teste"));
    }
    
    @After
    public void tearDown() {
    	
    	repository.delete(planeta1);
    	repository.delete(planeta2);
    }
    
    @Test
    public void testa_criar_planeta() {
        
    	Planeta planeta = repository.save(new Planeta("Hoth","teste","teste"));
        Assert.assertFalse(planeta.getId().isEmpty());
        repository.delete(planeta);
    }

    @Test
    public void testa_buscar_por_nome() {
    	
    	List<Planeta> result = repository.findByNomeContaining("R2D2");
    	Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void testa_buscar_por_id() {
    	
    	Optional<Planeta> obj = repository.findById("Hoth");
    	Assert.assertNotNull(obj);
    }

    @Test
    public void testa_buscar_todos_planetas() {
      
    	List<Planeta> result = repository.findAll();
        
    	Assert.assertFalse(result.isEmpty());
    }
    

}
