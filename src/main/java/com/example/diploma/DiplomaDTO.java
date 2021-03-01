package com.example.diploma;

public class DiplomaDTO {
    private String alumno;
    private Double promedio;
    private String mensaje;

    public Double getPromedio() {
        return promedio;
    }

    public String getAlumno() {
        return alumno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
