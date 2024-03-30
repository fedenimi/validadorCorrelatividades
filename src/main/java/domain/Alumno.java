package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas = new ArrayList<>();
    private String legajo;
    private String nombre;

    public Alumno(String legajo, String nombre, Materia ... aprobadas) {
        List<Materia> listaAprobadas;
        listaAprobadas = List.of(aprobadas);
        this.materiasAprobadas.addAll(listaAprobadas);
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public boolean cumpleCorrelativasDe(Materia unaMateria) {
       return unaMateria.correlativasEstanIncluidasEn(this.materiasAprobadas);
    }

}
