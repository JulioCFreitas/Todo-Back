package com.julio.todo.services.exceptions;

/*
 * ( Classe ObjectNotFoundException de Exceção para objeto não encontrado. )
 * 
 * ( Agora criar uma manipulador que manipular quando uma exceção desse tipo for lançada,
 * que sera criado no RESOURCE no PACKAGE RESOURCE.EXECPTION o ResourceExceptionHandler. )
 * 
 * ( E em RESOURCE.EXCEPTION será criado um objeto StandardError que tera 3 variaves, o TIMESTAMP do momento que ocorreu a 
 * exceção, o STATUS que o numero do HTTP 200 SUCESSO ou outro que seja, e uma MESSAGE que será personalizada. )
 * 
 */

public class ObjectNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public ObjectNotFoundException(String message) {
		super(message);
		
	}

}
