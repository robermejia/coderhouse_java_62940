package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nombre;

	@ManyToMany(fetch =FetchType.EAGER)
	@JoinTable(
				name ="producto_cliente", 
				joinColumns = @JoinColumn(name= "producto_id"), 
				inverseJoinColumns = @JoinColumn(name = "cliente_id")
			)
	private List<Cliente> clientes = new ArrayList<>();

	public Producto() {
		super();
	}
	
	public Producto(String nombre) {
		this();
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", clientes=" + clientes + "]";
	}


}
