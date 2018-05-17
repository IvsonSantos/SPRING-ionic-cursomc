package com.ivson.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.cursomc.domain.Categoria;
import com.ivson.cursomc.repository.CategoriaRepository;
import com.ivson.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElseThrow(
				() -> new ObjectNotFoundException("Categoria não encontrada: " + id)
				);
	}
}
