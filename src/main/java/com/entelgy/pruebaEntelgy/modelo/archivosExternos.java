package com.entelgy.pruebaEntelgy.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class archivosExternos {
	String url=null;
	public String leerUrl() {
		Properties properties = new Properties();
		InputStream entrada =null;
		
		try {
			entrada= new FileInputStream("src/main/resources/static/urlApi.properties");
			properties.load(entrada);
			url=properties.getProperty("direccion");
			return url.toString();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return "error";
	

	}


}
