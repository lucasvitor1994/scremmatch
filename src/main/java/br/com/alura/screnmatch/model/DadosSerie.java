package br.com.alura.screnmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
		@JsonAlias("totalSeasons")Integer totalTemporadas,
		@JsonAlias("imdbRating") String avaliacao,
		@JsonPropertyOrder("imdbVotes") String votos) {
	

}
