package br.com.b2w.apistar.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.b2w.apistar.exception.BadRequest;
import br.com.b2w.apistar.exception.ObjectNotFoundException;
import br.com.b2w.apistar.models.Planeta;
import br.com.b2w.apistar.repository.PlanetaRepository;

@Service
public class PlanetaService {

	
	private PlanetaRepository repo;
	
	@Autowired
	public PlanetaService(PlanetaRepository repo) {
		this.repo = repo;
	}
	
	public Planeta insere(Planeta obj) {
		verificaConteudo(obj);
		obj.setId(null);
		return repo.save(obj);
	}
	 
	public List<Planeta> encontraTodos(){
		return repo.findAll();
	}
	
	public Planeta encontraPorId(String id) {
		Optional<Planeta> obj = repo.findById(id);
		return  obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrada!!"));
	}
	
	public List<Planeta> findByNome(String nome){
		return repo.findByNomeContaining(nome);
	}
	
	public void deleta(String id) {
		repo.delete(encontraPorId(id));
	}
	
	public Planeta geraId(Planeta obj) {
		Planeta id = repo.save(new Planeta());     
		obj.setId(id.getId());
		return obj;
	}
	
	public Planeta verificaConteudo(Planeta obj) {
		try {	
			if(obj.getNome().isEmpty() || obj.getNome().equals(null)) {
				throw new BadRequest("Campo nome vazio");
			}
			if(obj.getClima().isEmpty()|| obj.getClima().equals(null)) {
				throw new BadRequest("Campo clima vazio");
			}
			if(obj.getTerreno().isEmpty()|| obj.getTerreno().equals(null)) {
				throw new BadRequest("Campo terreno vazio");
			}
		}catch(Exception e) {
			
			throw new BadRequest("Erro ao inserir null");
		}
		return obj;
		
	}
}
