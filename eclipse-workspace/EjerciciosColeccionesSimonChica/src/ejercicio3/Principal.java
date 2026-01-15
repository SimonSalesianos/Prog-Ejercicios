package ejercicio3;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		 Playlist playlist = new Playlist("Mi Playlist Favorita");

	        playlist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", "Rock", 354));
	        playlist.agregarCancion(new Cancion("Stairway to Heaven", "Led Zeppelin", "Rock", 482));
	        playlist.agregarCancion(new Cancion("Imagine", "John Lennon", "Pop", 183));
	        playlist.agregarCancion(new Cancion("Billie Jean", "Michael Jackson", "Pop", 294));
	        playlist.agregarCancion(new Cancion("Smells Like Teen Spirit", "Nirvana", "Grunge", 301));
	        playlist.agregarCancion(new Cancion("Hotel California", "Eagles", "Rock", 391));
	        playlist.agregarCancion(new Cancion("Thriller", "Michael Jackson", "Pop", 357));
	        playlist.agregarCancion(new Cancion("Sweet Child O' Mine", "Guns N' Roses", "Rock", 356));
	        playlist.agregarCancion(new Cancion("Come As You Are", "Nirvana", "Grunge", 219));
	        playlist.agregarCancion(new Cancion("Yesterday", "The Beatles", "Pop", 123));
	        playlist.agregarCancion(new Cancion("Hey Jude", "The Beatles", "Rock", 431));
	       

	        Scanner sc = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\n GESTIÓN DE PLAYLIST ");
	            System.out.println("0. Salir");
	            System.out.println("1. Agregar nueva canción");
	            System.out.println("2. Mostrar todas las canciones");
	            System.out.println("3. Buscar canción por nombre");
	            System.out.println("4. Buscar canciones por autor");
	            System.out.println("5. Buscar canciones por duración exacta");
	            System.out.println("6. Buscar canciones por rango de duración");
	            System.out.println("7. Contar canciones de un género");
	            System.out.println("8. Verificar si todas las canciones duran más de X segundos");
	            System.out.println("9. Contar intérpretes distintos");
	            System.out.println("10. Mostrar lista de intérpretes distintos");
	            System.out.println("11. Obtener canción más larga");
	            System.out.println("12. Obtener canción más corta");
	            System.out.println("13. Obtener canciones de un género específico");
	            System.out.println("14. Mostrar géneros distintos");
	            System.out.print("Elige una opción: ");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	            
	            	case 0:
	            		System.out.println("Saliendo del programa...");	
	            		
	            		break;
	            
		            case 1:
		            	
	                    System.out.print("Nombre de la canción: ");
	                    String nombre = sc.nextLine();
	                    System.out.print("Autor: ");
	                    String autor = sc.nextLine();
	                    System.out.print("Género: ");
	                    String genero = sc.nextLine();
	                    System.out.print("Duración (segundos): ");
	                    int seg = sc.nextInt();
	                    sc.nextLine();
	                    
	                    playlist.agregarCancion(new Cancion(nombre, autor, genero, seg));
	                    System.out.println("✓ Canción agregada.");
	                    
	                    break;
	            
	                case 2:
	                	
	                    playlist.mostrarCanciones();
	                    
	                    break;

	                case 3:
	                	
	                    System.out.print("Introduce el nombre de la canción: ");
	                    String nombreBuscar = sc.nextLine();
	                    List<Cancion> porNombre = playlist.buscarPorNombre(nombreBuscar);
	                    
	                    if (porNombre.isEmpty()) {
	                        System.out.println("No se encontraron canciones con ese nombre.");
	                    } else {
	                        System.out.println("\nCanciones encontradas:");
	                        porNombre.forEach(System.out::println);
	                    }
	                    
	                    break;

	                case 4:
	                	
	                    System.out.print("Introduce el nombre del autor: ");
	                    String autorBuscar = sc.nextLine();
	                    List<Cancion> porAutor = playlist.buscarPorAutor(autorBuscar);
	                    
	                    if (porAutor.isEmpty()) {
	                        System.out.println("No se encontraron canciones de ese autor.");
	                    } else {
	                        System.out.println("\nCanciones de " + autorBuscar + ":");
	                        porAutor.forEach(System.out::println);
	                    }
	                    
	                    break;

	                case 5:
	                	
	                    System.out.print("Introduce la duración en segundos: ");
	                    int duracion = sc.nextInt();
	                    sc.nextLine();
	                    List<Cancion> porDuracion = playlist.buscarPorDuracion(duracion);
	                    
	                    if (porDuracion.isEmpty()) {
	                        System.out.println("No se encontraron canciones con esa duración exacta.");
	                    } else {
	                        System.out.println("\nCanciones con duración de " + duracion + " segundos:");
	                        porDuracion.forEach(System.out::println);
	                    }
	                    
	                    break;

	                case 6:
	                	
	                    System.out.print("Introduce la duración mínima (segundos): ");
	                    int minDur = sc.nextInt();
	                    System.out.print("Introduce la duración máxima (segundos): ");
	                    int maxDur = sc.nextInt();
	                    sc.nextLine();
	                    List<Cancion> enRango = playlist.buscarPorDuracionRango(minDur, maxDur);
	                    
	                    if (enRango.isEmpty()) {
	                        System.out.println("No se encontraron canciones en ese rango.");
	                    } else {
	                        System.out.println("\nCanciones entre " + minDur + " y " + maxDur + " segundos:");
	                        enRango.forEach(System.out::println);
	                    }
	                    
	                    break;

	                    
	                case 7:
	                	
	                    System.out.print("Introduce el género: ");
	                    String generoContar = sc.nextLine();
	                    long cantidadGenero = playlist.contarCancionesPorGenero(generoContar);
	                    System.out.println("Canciones de género " + generoContar + ": " + cantidadGenero);
	                    
	                    break;

	                case 8:
	                	
	                    System.out.print("Introduce la duración mínima (segundos): ");
	                    int duracionMin = sc.nextInt();
	                    sc.nextLine();
	                    boolean todasMayores = playlist.todasDuranMasDe(duracionMin);
	                    
	                    if (todasMayores) {
	                        System.out.println("Todas las canciones duran más de " + duracionMin + " segundos.");
	                    } else {
	                        System.out.println("No todas las canciones duran más de " + duracionMin + " segundos.");
	                    }
	                    
	                    break;

	                case 9:
	                	
	                    long cantidadInterpretes = playlist.contarInterpretesDistintos();
	                    System.out.println("Número de intérpretes distintos: " + cantidadInterpretes);
	                    
	                    break;

	                case 10:
	                	
	                    List<String> interpretes = playlist.obtenerInterpretesDistintos();
	                    System.out.println("\nIntérpretes distintos:");
	                    interpretes.forEach(System.out::println);
	                    
	                    break;

	                case 11:
	                	
	                    Optional<Cancion> masLarga = playlist.cancionMasLarga();
	                    
	                    if (masLarga.isPresent()) {
	                        System.out.println("\nCanción más larga:");
	                        System.out.println(masLarga.get());
	                    } else {
	                        System.out.println("No hay canciones en la playlist.");
	                    }
	                    
	                    break;

	                case 12:
	                	
	                    Optional<Cancion> masCorta = playlist.cancionMasCorta();
	                    
	                    if (masCorta.isPresent()) {
	                        System.out.println("\nCanción más corta:");
	                        System.out.println(masCorta.get());
	                    } else {
	                        System.out.println("No hay canciones en la playlist.");
	                    }
	                    
	                    break;

	               

	                case 13:
	                	
	                    System.out.print("Introduce el género: ");
	                    String generoFiltrar = sc.nextLine();
	                    List<Cancion> porGenero = playlist.obtenerCancionesPorGenero(generoFiltrar);
	                    
	                    if (porGenero.isEmpty()) {
	                        System.out.println("No hay canciones de ese género.");
	                    } else {
	                        System.out.println("\nCanciones de género " + generoFiltrar + ":");
	                        porGenero.forEach(System.out::println);
	                    }
	                    
	                    break;

	               

	                case 14:
	                	
	                    List<String> generos = playlist.obtenerGenerosDistintos();
	                    System.out.println("\nGéneros distintos en la playlist:");
	                    generos.forEach(System.out::println);
	                    
	                    break;
	                

	                

	                default:
	                    System.out.println("Opción no válida.");
	            }

	        } while (opcion != 0);

	        sc.close();
	    }
	}
