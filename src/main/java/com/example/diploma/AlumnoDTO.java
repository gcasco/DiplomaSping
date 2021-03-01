package com.example.diploma;

import java.util.List;

public class AlumnoDTO {
    private String nombre;
    private MateriaDTO[] materias;

    public String getNombre() {
        return nombre;
    }

    public MateriaDTO[] getMaterias() {
        return materias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateriaDTOS(MateriaDTO[] materiaDTOS) {
        this.materias = materiaDTOS;
    }
}
