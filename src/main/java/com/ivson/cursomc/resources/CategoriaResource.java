package com.ivson.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.cursomc.domain.Categoria;
import com.ivson.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	/**
	 * ResponseEntity armazena varias informacçoes de uma resposta HTTP para um serviço REST
	 * 		Tipo "?" pode ser de qualquer tipo (encontrar/nao encontrar)
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		Categoria categoria = service.buscar(id);
		return ResponseEntity.ok().body(categoria);
	}
	
}