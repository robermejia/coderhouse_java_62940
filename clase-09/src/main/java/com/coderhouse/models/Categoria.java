package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "Categorias")
public class Categoria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(unique = true, nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy= "categoria", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();

	
	public Categoria() {
		super();
	}

	public Categoria(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", cursos=" + cursos + "]";
	}
	
	
}
