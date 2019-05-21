package br.com.b2w.apistar.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetaApi {

	private String name;

	private List<String> films;

	public PlanetaApi(String name, List<String> films) {
		this.name = name;
		this.films = films;
	}

}
