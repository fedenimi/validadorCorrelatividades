package domain;

import org.junit.Assert;
import org.junit.Before;
import java.util.Arrays;
import java.util.Collections;


public class TestAlumno {
    private Alumno juan;
    private Alumno esteban;
    private Alumno rodri;
    private Materia algoritmos;
    private Materia discreta;
    private Materia sintaxis;
    private Materia iYs;

    @Before
    public void inicializar()
    {
        discreta = new Materia("Matemática Discreta");
        algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        sintaxis = new Materia("Sintaxis y Semántica de los Lenguajes", algoritmos, discreta);
        iYs = new Materia("Ingeniería Y Sociedad");
        juan = new Alumno("1565619", "Juan", algoritmos, discreta);
        esteban = new Alumno("1565620", "Esteban", algoritmos);
        rodri = new Alumno("1565621", "Rodrigo");
    }

    @org.junit.Test
    public void juanASintaxisEIngenieriaYSociedad ()
    {
        Inscripcion inscripcion = new Inscripcion(juan, Arrays.asList(sintaxis, iYs));
        Assert.assertTrue(inscripcion.aprobada());
    }
    @org.junit.Test
    public void rodrigoAAlgoritmos ()
    {
        Inscripcion inscripcion = new Inscripcion(rodri, Collections.singletonList(algoritmos));
        Assert.assertTrue(inscripcion.aprobada());
    }

    @org.junit.Test
    public void EstebanDesaprobado ()
    {
        Inscripcion inscripcion = new Inscripcion(esteban, Arrays.asList(sintaxis, discreta));
        Assert.assertFalse(inscripcion.aprobada());
    }

}
