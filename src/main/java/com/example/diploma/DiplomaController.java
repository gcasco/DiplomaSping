package com.example.diploma;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiplomaController {
    private static final String MSG="Su promedio es ";

    //Bogy Example: {"dia":6,"mes":2,"año":1990}
    @PostMapping(path = "/diploma")
    @ResponseBody
    public DiplomaDTO getDiploma(@RequestBody AlumnoDTO alumnoDTO){
        DiplomaDTO result = new DiplomaDTO();
        result.setAlumno(alumnoDTO.getNombre());
        result.setPromedio(calcularPromedio(alumnoDTO.getMaterias()));
        result.setMensaje(obtenerMensaje(result.getPromedio()));

        return result;
    }

    public Double calcularPromedio(MateriaDTO[] materias){
        //para que no se queje del Double
        Double notas = 0d;

        for(MateriaDTO materia:materias){
                notas=notas+materia.getNota();
        }
        return (notas/materias.length);
    }

    public String obtenerMensaje(Double promedio){
        String msg=MSG+promedio;
        if(promedio>9){
            msg = "Felicitaciones !!, "+msg;
        }
        return msg;
    }
}
