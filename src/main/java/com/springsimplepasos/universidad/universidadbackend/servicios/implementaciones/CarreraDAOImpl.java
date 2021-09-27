package com.springsimplepasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplepasos.universidad.universidadbackend.repositorios.CarreraRepository;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO
{
    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

    @Override
    @Transactional( readOnly = true )
    public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
        return repository.findCarrerasByNombreContains( nombre );
    }

    @Override
    @Transactional( readOnly = true )
    public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
        return repository.findCarrerasByNombreContainsIgnoreCase( nombre );
    }

    @Override
    @Transactional( readOnly = true )
    public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios) {
        return repository.findCarrerasByCantidadAniosAfter( cantidadAnios );
    }

    /*@Autowired
    private CarreraRepository repository;

    @Override
    @Transactional( readOnly = true )
    public Optional<Carrera> findById(Integer id) {
        return repository.findById( id );
    }

    @Override
    @Transactional
    public Carrera save(Carrera carrera) {
        return repository.save( carrera );
    }

    @Override
    @Transactional( readOnly = true )
    public Iterable<Carrera> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        repository.deleteById( id );
    }*/

}
