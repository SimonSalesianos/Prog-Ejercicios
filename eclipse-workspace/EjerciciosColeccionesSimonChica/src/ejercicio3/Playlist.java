package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Playlist {

    private String nombrePlaylist;
    private List<Cancion> canciones;

    public Playlist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
        this.canciones = new ArrayList<>();
    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void mostrarCanciones() {
        System.out.println("\n Playlist: " + nombrePlaylist + " ");
        if (canciones.isEmpty()) {
            System.out.println("No hay canciones en la playlist.");
        } else {
            canciones.forEach(System.out::println);
        }
    }

    public List<Cancion> buscarPorNombre(String nombre) {
        return canciones.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Cancion> buscarPorAutor(String autor) {
        return canciones.stream()
                .filter(c -> c.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<Cancion> buscarPorDuracion(int duracionSegundos) {
        return canciones.stream()
                .filter(c -> c.getDuracionSegundos() == duracionSegundos)
                .collect(Collectors.toList());
    }

    public List<Cancion> buscarPorDuracionRango(int minSegundos, int maxSegundos) {
        return canciones.stream()
                .filter(c -> c.getDuracionSegundos() >= minSegundos && 
                             c.getDuracionSegundos() <= maxSegundos)
                .collect(Collectors.toList());
    }

    public long contarCancionesPorGenero(String genero) {
        return canciones.stream()
                .filter(c -> c.getGenero().equalsIgnoreCase(genero))
                .count();
    }

    public boolean todasDuranMasDe(int duracionMinima) {
        return canciones.stream()
                .allMatch(c -> c.getDuracionSegundos() > duracionMinima);
    }

    public long contarInterpretesDistintos() {
        return canciones.stream()
                .map(Cancion::getAutor)
                .distinct()
                .count();
    }

    public List<String> obtenerInterpretesDistintos() {
        return canciones.stream()
                .map(Cancion::getAutor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Optional<Cancion> cancionMasLarga() {
        return canciones.stream()
                .max((c1, c2) -> Integer.compare(c1.getDuracionSegundos(), c2.getDuracionSegundos()));
    }

    public Optional<Cancion> cancionMasCorta() {
        return canciones.stream()
                .min((c1, c2) -> Integer.compare(c1.getDuracionSegundos(), c2.getDuracionSegundos()));
    }

    

    

    public List<Cancion> obtenerCancionesPorGenero(String genero) {
        return canciones.stream()
                .filter(c -> c.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }

   

    public List<String> obtenerGenerosDistintos() {
        return canciones.stream()
                .map(Cancion::getGenero)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

  

   

  
}

