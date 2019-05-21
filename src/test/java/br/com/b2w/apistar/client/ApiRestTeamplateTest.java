package br.com.b2w.apistar.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.b2w.apistar.models.ResultApi;

import br.com.b2w.apistar.client.ApiRestTeamplate;


public class ApiRestTeamplateTest {
    
    @Autowired
    ApiRestTeamplate rest;

    @Before
	public void setUp() {
		rest = new ApiRestTeamplate();
	}
    
	@Test
    public void testa_Retorna_Aparicoes() {
		ResponseEntity<ResultApi> result = rest.RetornaAparicoes();
    	Assert.assertNotNull(result);
     }
}
 