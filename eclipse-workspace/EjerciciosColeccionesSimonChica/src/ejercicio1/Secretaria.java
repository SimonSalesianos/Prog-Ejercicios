package ejercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secretaria {
    private List<Alumno> alumnos;

   

    @Override
	public String toString() {
		return "Secretaria [alumnos=" + alumnos + "]";
	}

	public Secretaria(List<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
	

	public List<Alumno> obtenerTodosAlumnos() {
        return alumnos.stream()
                .filter(alumno -> alumno != null)
                .collect(Collectors.toList());
    }

    public void mostrarTodosAlumnos() {
        alumnos.stream()
                .forEach(System.out::println);
    }

    public void imprimirAlumnosLetraInicial(String letra) {
        alumnos.stream()
                .filter(alumno -> alumno.getNombre().toUpperCase().startsWith(String.valueOf(letra).toUpperCase()))
                .forEach(System.out::println);
    }

    public long obtenerTamañoLista() {
        return alumnos.stream().count();
    }

    public List<Alumno> obtenerAlumnosNotaMinima(double notaMinima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNotaMedia() > notaMinima)
                .collect(Collectors.toList());
    }

    public void imprimirTresPrimerosAlumnos() {
        alumnos.stream()
                .limit(3)
                .forEach(System.out::println);
    }

    public Optional<Alumno> obtenerAlumnoMenorEdad() {
        return alumnos.stream()
                .min(Comparator.comparing(Alumno::getEdad));
    }

    public Optional<Alumno> obtenerPrimerAlumno() {
        return alumnos.stream().findFirst();
    }

    public List<Alumno> obtenerAlumnosLongitudNombre(int longitudMinima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNombre().length() > longitudMinima)
                .collect(Collectors.toList());
    }

    public List<Alumno> obtenerAlumnosLetraAYLongitud(int longitudMaxima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNombre().toUpperCase().startsWith("A"))
                .filter(alumno -> alumno.getNombre().length() <= longitudMaxima)
                .collect(Collectors.toList());
    }
}