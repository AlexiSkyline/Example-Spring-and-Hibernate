package com.springsimplepasos.universidad.universidadbackend.servicios.contratos;


import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO
{
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre );
}
