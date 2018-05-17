package com.ivson.cursomc.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	/**
	 * Passando a Excecao que veio
	 * @param msg
	 * @param cause
	 */
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
