package com.springsimplepasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;

public interface CarreraDAO extends GenericoDAO<Carrera>
{
    Iterable<Carrera> findCarrerasByNombreContains( String nombre );
    Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase( String nombre );
    Iterable<Carrera> findCarrerasByCantidadAniosAfter( Integer cantidadAnios );
}
