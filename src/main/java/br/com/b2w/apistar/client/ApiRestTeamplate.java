package br.com.b2w.apistar.client;


import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.b2w.apistar.exception.ServiceUnavailable;
import br.com.b2w.apistar.models.ResultApi;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
@NoArgsConstructor
@AllArgsConstructor
public class ApiRestTeamplate {
	// Teste para saber se a API do swapi está online. 
    final static String url = "https://swapi.co/api/planets/";
	   
    RestTemplate restTemplate = new RestTemplate();

	public ResponseEntity<ResultApi> RetornaAparicoes() {
		try { 
			return restTemplate.exchange(url, HttpMethod.GET,geraHeader(),ResultApi.class);
   		}catch(Exception e) {
   			throw new ServiceUnavailable("API swapi está fora do ar");
   		}
   	}
	
	public HttpEntity<String> geraHeader(){
		
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		return entity;
	}


}
	    	

