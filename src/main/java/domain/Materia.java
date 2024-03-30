package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Materia {
    private List<Materia> correlativas = new ArrayList<>();
    private String nombre;

    public Materia(String nombre, Materia ... correlativasDe) {
        List<Materia> listaCorrelativas;
        listaCorrelativas = List.of(correlativasDe);
        this.correlativas.addAll(listaCorrelativas);
        this.nombre = nombre;
    }

    public boolean correlativasEstanIncluidasEn(List<Materia> materiasAprobadas) {
        return new HashSet<>(materiasAprobadas).containsAll(this.correlativas);
    }
}
