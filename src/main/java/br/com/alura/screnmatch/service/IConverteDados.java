package br.com.alura.screnmatch.service;

public interface IConverteDados {
	// <T> T siguinifica que espero algo generico não pode ser uma string ou inter
	<T> T obterDados(String json, Class<T> classe);

}
