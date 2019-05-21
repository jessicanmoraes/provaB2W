package br.com.b2w.apistar.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultApi {

	private List<PlanetaApi> results;

	public ResultApi(List<PlanetaApi> results, String name) {
		this.results = results;
	}

	
}
