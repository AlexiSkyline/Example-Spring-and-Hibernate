package com.springsimplepasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplepasos.universidad.universidadbackend.repositorios.AlumnoRepository;
import com.springsimplepasos.universidad.universidadbackend.repositorios.PersonaRepository;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO
{
    @Autowired
    public AlumnoDAOImpl( @Qualifier( "repositorioAlumnos" ) PersonaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return ( (AlumnoRepository) repository ).buscarAlumnosPorNombreCarrera( nombre );
    }

    /*@Autowired
    @Qualifier( "repositorioAlumnos" )
    private PersonaRepository repository;

    @Override
    @Transactional( readOnly = true )
    public Optional<Persona> findById(Integer id) {
        return repository.findById( id );
    }

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return repository.save( persona );
    }

    @Override
    @Transactional( readOnly = true )
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById( id );
    }*/
}
