package com.bbva.cdrg.lib.r001.impl;

import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import com.bbva.cdrg.dto.rutas.DataOut;
import com.bbva.cdrg.lib.r001.CDRGR001;

public class CDRGR001Impl extends CDRGR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CDRGR001.class);

	/**
	 * @param Salida
	 * @param destino
	 * Execute operations
	 * @return
	 */
	@Override
	public DataOut execute(String salida, String destino) {

		LOGGER.info("Starting execute");

		DataOut result = new DataOut();

		try{
		result.setValorRecorrido(valor(salida, destino));
		result.setTiempo(time(salida, destino));
		result.setDistancia(dist(salida, destino));
		}catch(Exception e){
			LOGGER.info("Error execute");
		}
		return result;
	}

	/**
	 * @param salida
	 * @param destino
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * Method to calculate value of distance
	 */
	private String valor(String salida, String destino) throws JsonParseException, JsonMappingException, IOException{
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();	
		String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + salida
				+ "&destination=" + destino + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
		
		JsonNode jsonNode = objectMapper.readValue(json, JsonNode.class);
		JsonNode distancia = jsonNode.get("routes").get(2).get(1).get("distance").get("value");
		
		int val = 2000*(Integer.parseInt(distancia.getTextValue()));
	
		return Integer.toString(val);
	}

	/**
	 * @param salida
	 * @param destino
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * Method to search the time 
	 */
	private String time(String salida, String destino) throws JsonParseException, JsonMappingException, IOException {
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();	
		String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + salida
				+ "&destination=" + destino + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
		
		JsonNode jsonNode = objectMapper.readValue(json, JsonNode.class);
		JsonNode tiempo = jsonNode.get("routes").get(2).get(1).get("duration").get("text");
		
		return tiempo.getTextValue();
	}

	/**
	 * @param salida
	 * @param destino
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * Method to search the distance 
	 */
	private String dist(String salida, String destino) throws JsonParseException, JsonMappingException, IOException {
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();	
		String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + salida
				+ "&destination=" + destino + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
		
		JsonNode jsonNode = objectMapper.readValue(json, JsonNode.class);
		JsonNode distancia = jsonNode.get("routes").get(2).get(1).get("distance").get("text");
			
		return distancia.getTextValue();
	}

}
