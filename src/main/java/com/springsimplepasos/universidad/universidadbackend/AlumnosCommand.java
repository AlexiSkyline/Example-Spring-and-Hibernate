package com.springsimplepasos.universidad.universidadbackend;

import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplepasos.universidad.universidadbackend.modelo.entidades.Persona;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.AlumnoDAO;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import com.springsimplepasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AlumnosCommand implements CommandLineRunner
{
    @Autowired
    @Qualifier( "alumnoDAOImpl" )
    private PersonaDAO personaDAO;
    @Autowired
    private CarreraDAO carreraDAO;

    @Override
    public void run(String... args) throws Exception
    {
        /*Optional<Carrera> ingSistemas= carreraDAO.findById( 2 );

        Iterable<Persona> alumnos = personaDAO.findAll();
        alumnos.forEach( alumno -> ( (Alumno)alumno ).setCarrera( ingSistemas.get() ) );
        alumnos.forEach( alumno -> personaDAO.save( alumno ) );*/

        /*Optional<Persona> alumno_1 = personaDAO.findById( 1 );

        Optional<Persona> personaNomApe = personaDAO.buscarPorNombreYApellido( alumno_1.get().getNombre(), alumno_1.get().getApellido() );
        System.out.println( personaNomApe.toString() );

        Optional<Persona> personaDNI =  personaDAO.buscarPorDni( alumno_1.get().getDni() );
        System.out.println( personaDNI.toString() );

        Iterable<Persona> personaApellidos = personaDAO.buscarPersonaPorApellido( alumno_1.get().getApellido() );
        personaApellidos.forEach(System.out::println);*/

        Optional<Carrera> ingSistemas= carreraDAO.findById( 2 );

        Iterable<Persona> alumnosCarrera = ( ( AlumnoDAO ) personaDAO ).buscarAlumnosPorNombreCarrera( ingSistemas.get().getNombre() );
        alumnosCarrera.forEach(System.out::println);
    }
}
