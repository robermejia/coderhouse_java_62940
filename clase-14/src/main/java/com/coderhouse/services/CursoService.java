package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;
import com.coderhouse.repositories.CategoriaRepository;
import com.coderhouse.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Curso> getAllCursos() {
		return cursoRepository.findAll();
	}

	public Curso getCursoById(Long id) {
		return cursoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

	}

	@Transactional
	public Curso createCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Transactional
	public Curso updateCurso(Long id, Curso cursoDetails) {
		Curso curso = cursoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
		curso.setNombre(cursoDetails.getNombre());
		return cursoRepository.save(curso);

	}

	public void deleteCurso(Long id) {
		if (cursoRepository.existsById(id)) {
			cursoRepository.deleteById(id);
		} else {
			throw new IllegalArgumentException("Curso no encontrado");
		}
	}

	@Transactional
	public Curso asignarCategoriaACurso(Long cursoId, Long categoriaId) {
		Categoria categoria = categoriaRepository.findById(categoriaId)
				.orElseThrow(() -> new IllegalArgumentException("Categoria no encontrado"));
		Curso curso = cursoRepository.findById(cursoId)
				.orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

		curso.setCategoria(categoria);

		return cursoRepository.save(curso);
	}

}