package com.example.school.services;

import com.example.school.domain.dtos.LoginUserDto;
import com.example.school.domain.entities.Docente;
import com.example.school.domain.entities.Estudiante;
import com.example.school.domain.entities.Persona;
import com.example.school.domain.interfaces.repositories.IDocenteRepository;
import com.example.school.domain.interfaces.repositories.IEstudianteRepository;
import com.example.school.domain.interfaces.repositories.IPersonaRepository;
import com.example.school.domain.interfaces.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

   // @Autowired
   // IEstudianteRepository estudianteRepository;

  //  @Autowired
  //  IDocenteRepository docenteRepository;


    @Override
    public LoginUserDto GetLogin(String userName, String password, String type) {
       /* switch (type) {
            case "student": {
                Estudiante result = estudianteRepository.findByCodigoAndPassword(userName, password);
                return buildLoginUserDto(result);
            }
            case "teacher": {
                Docente result = docenteRepository.findByCodigoAndPassword(userName, password);
                return buildLoginUserDto(result);
            }
            default:
                return null;
        }*/
        return  null   ;
    }

  /*  private LoginUserDto buildLoginUserDto(Object user) {
        if (user != null) {
            Optional<Persona> optionalPersona = Optional.ofNullable(((Persona) user).getPersona());
            if (optionalPersona.isPresent()) {
                Persona persona = optionalPersona.get();
                String nombres = persona.getApellidos() + ", " + persona.getNombres();
                String email = persona.getEmail();
                if (user instanceof Estudiante) {
                    return new LoginUserDto(((Estudiante) user).getIdEstudiante(), nombres, "Estudiante", email);
                } else if (user instanceof Docente) {
                    return new LoginUserDto(((Docente) user).getIdDocente(), nombres, "Docente", email);
                }
            }
        }
        return null;
    }*/
}
