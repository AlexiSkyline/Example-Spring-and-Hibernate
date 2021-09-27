package com.springsimplepasos.universidad.universidadbackend;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Alumno;
import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Direccion;
import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UniversidadBackendApplication
{
	/*@Autowired
	private AlumnoDAO servicio;
	*/
	public static void main(String[] args) {
		String[] beanDefinitionsNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
		/*for( String str : beanDefinitionsNames ) {
			System.out.println( str );
		}*/
	}

	/*@Bean
	public CommandLineRunner runner() {
		return arg -> {
			*//*Direccion direccion = new Direccion( "calle falsa", "125", "29212", "", "", "Junin" );
			Persona alumno = new Alumno( null, "Alexis", "López", "2222222222", direccion );

			Persona save = servicio.save( alumno );
			System.out.println( save.toString() );*//*

			*//*List<Persona> alumnos = (List<Persona>) servicio.findAll();
			alumnos.forEach(System.out::println);*//*
		};
	}*/

}
