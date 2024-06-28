package br.com.alura.screnmatch.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screnmatch.model.DadosSerie;

@SpringBootApplication
public class ScrenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrenmatchApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
//		ConsumoAPI consumoAPI = new ConsumoAPI();
		var consumoAPI = new ConsumoApi();
		
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=a2001ab7");
		System.out.println(json);
		ConverteDados converteDados = new ConverteDados();
		DadosSerie dadosSerie = converteDados.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);
		
	}

}
