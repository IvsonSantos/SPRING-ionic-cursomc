package com.ivson.cursomc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ivson.cursomc.service.exceptions.ObjectNotFoundException;

/**
 * Classe para receber as excecoes em REST, é padrao
 * @author Santo
 *
 */
@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)// para indicar que e um tratador de excecoes deste tipo de excecao
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, 
														HttpServletRequest request) {
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), 
											  e.getMessage(), 
											  System.currentTimeMillis());
		
		return ResponseEntity
							 .status(HttpStatus.NOT_FOUND)
							 .body(err);
	}
		
}
