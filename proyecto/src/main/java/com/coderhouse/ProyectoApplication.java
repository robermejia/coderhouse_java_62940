package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner {

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {

			Producto producto1 = new Producto("Televisor Hisense");
			Producto producto2 = new Producto("Radio AM/FM");
			Producto producto3 = new Producto("Ventilador");
			Producto producto4 = new Producto("Refrigerador");

		    Cliente cliente1 = new Cliente("Roberto Agustín", "Mejía Collazos", 123456789, "A1212121212");
		    Cliente cliente2 = new Cliente("Gustavo Agustín", "Mejía Collazos", 234567890, "B1212121212");
		    Cliente cliente3 = new Cliente("Erica Narda", "Mejía Collazos", 345678901, "C1212121212");
		    Cliente cliente4 = new Cliente("Narda Liliana", "Collazos Miñan", 456789012, "D1212121212");

			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			dao.persistirCliente(cliente3);
			dao.persistirCliente(cliente4);

			dao.persistirProducto(producto1);
			dao.persistirProducto(producto2);
			dao.persistirProducto(producto3);
			dao.persistirProducto(producto4);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}

}