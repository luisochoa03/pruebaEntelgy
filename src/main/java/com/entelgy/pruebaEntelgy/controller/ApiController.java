package com.entelgy.pruebaEntelgy.controller;



import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.entelgy.pruebaEntelgy.modelo.*;


@RestController
public class ApiController {

	@PostMapping("/formato")
	public ResponseEntity<Datos[]> formato(Datos datos) {
		archivosExternos archivo =new archivosExternos();
		String url=archivo.leerUrl();
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Datos[]> response = restTemplate.exchange(url, HttpMethod.GET, entity,Datos[].class);
		return response;
	}

}
