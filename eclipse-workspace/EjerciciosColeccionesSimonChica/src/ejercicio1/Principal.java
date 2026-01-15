package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Ana", "García López", "DAW", 8.5, 20));
        listaAlumnos.add(new Alumno("Alberto", "Martínez Pérez", "DAM", 7.2, 22));
        listaAlumnos.add(new Alumno("Carlos", "Rodríguez Sanz", "ASIR", 9.1, 19));
        listaAlumnos.add(new Alumno("Diana", "Fernández Ruiz", "DAW", 6.8, 21));
        listaAlumnos.add(new Alumno("Elena", "López Torres", "DAM", 8.9, 18));
        listaAlumnos.add(new Alumno("Antonio", "Sánchez Gómez", "ASIR", 7.5, 23));

        Secretaria secretaria = new Secretaria(listaAlumnos);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
        	
            System.out.println("\n MENÚ GESTIÓN ALUMNOS ");
            System.out.println("0. Salir");
            System.out.println("1. Obtener todos los alumnos ");
            System.out.println("2. Mostrar todos los alumnos ");
            System.out.println("3. Alumnos por letra inicial");
            System.out.println("4. Tamaño de la lista ");
            System.out.println("5. Alumnos con nota mayor a X");
            System.out.println("6. Mostrar 3 primeros alumnos ");
            System.out.println("7. Alumno de menor edad ");
            System.out.println("8. Primer alumno ");
            System.out.println("9. Alumnos con nombre largo");
            System.out.println("10. Alumnos que empiezan por A con longitud en concreto");
            System.out.print("Seleccione opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
            
            	case 0:
            	
            		System.out.println("Saliendo...");
                
            		break;
            
                case 1:
                	
                    System.out.println("\nTodos los alumnos:");
                    secretaria.obtenerTodosAlumnos().forEach(System.out::println);
                    
                    break;
                    
                case 2:
                	
                    System.out.println("\nMostrando todos los alumnos:");
                    secretaria.mostrarTodosAlumnos();
                    
                    break;
                    
                case 3:
                	
                    System.out.print("Introduce la letra inicial: ");
                    String letra = scanner.nextLine();
                    System.out.println("\nAlumnos que empiezan por '" + letra + "':");
                    secretaria.imprimirAlumnosLetraInicial(letra);
                    
                    break;
                    
                case 4:
                	
                    System.out.println("\nTamaño de la lista: " + secretaria.obtenerTamañoLista());
                    
                    break;
                    
                case 5:
                	
                    System.out.print("Introduce nota mínima: ");
                    double nota = scanner.nextDouble();
                    System.out.println("\nAlumnos con nota mayor a " + nota + ":");
                    secretaria.obtenerAlumnosNotaMinima(nota).forEach(System.out::println);
                    
                    break;
                    
                case 6:
                	
                    System.out.println("\nPrimeros 3 alumnos:");
                    secretaria.imprimirTresPrimerosAlumnos();
                    
                    break;
                    
                case 7:
                	
                    Optional<Alumno> menorEdad = secretaria.obtenerAlumnoMenorEdad();
                    System.out.println("\nAlumno de menor edad:");
                    menorEdad.ifPresent(System.out::println);
                    
                    break;
                    
                case 8:
                	
                    Optional<Alumno> primero = secretaria.obtenerPrimerAlumno();
                    System.out.println("\nPrimer alumno:");
                    primero.ifPresent(System.out::println);
                    
                    break;
                    
                case 9:
                	
                    System.out.print("Introduce longitud mínima del nombre: ");
                    int longitud = scanner.nextInt();
                    System.out.println("\nAlumnos con nombre de más de " + longitud + " letras:");
                    secretaria.obtenerAlumnosLongitudNombre(longitud).forEach(System.out::println);
                    
                    break;
                    
                case 10:
                	
                    System.out.print("Introduce longitud máxima: ");
                    int maxLongitud = scanner.nextInt();
                    System.out.println("\nAlumnos que empiezan por A con longitud <= " + maxLongitud + ":");
                    secretaria.obtenerAlumnosLetraAYLongitud(maxLongitud).forEach(System.out::println);
                    
                    break;
                
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
