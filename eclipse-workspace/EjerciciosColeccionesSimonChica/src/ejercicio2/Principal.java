package ejercicio2;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        OperacionesCadenas manipulador = new OperacionesCadenas();

        manipulador.agregarPalabra("Java");
        manipulador.agregarPalabra("Python");
        manipulador.agregarPalabra("JavaScript");
        manipulador.agregarPalabra("C++");
        manipulador.agregarPalabra("Ruby");
        manipulador.agregarPalabra("Go");
        manipulador.agregarPalabra("Swift");
        manipulador.agregarPalabra("Kotlin");
        manipulador.agregarPalabra("PHP");
        manipulador.agregarPalabra("TypeScript");
        manipulador.agregarPalabra("Rust");
        manipulador.agregarPalabra("Perl");
        manipulador.agregarPalabra("HTML5");

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n MENÚ GESTIÓN DE CADENAS ");
            System.out.println("0. Salir");
            System.out.println("1. Agregar nueva palabra a la lista");
            System.out.println("2. Mostrar todas las palabras");
            System.out.println("3. Ordenar alfabéticamente");
            System.out.println("4. Buscar una cadena");
            System.out.println("5. Crear String con iniciales");
            System.out.println("6. Borrar palabras de longitud impar");
            System.out.println("7. Convertir todas a mayúsculas");
            System.out.println("8. Validar si una cadena contiene solo letras");
            System.out.println("9. Validar email");
            System.out.println("10. Buscar palabras por letra inicial");
            System.out.println("11. Extraer palabras que contienen números");
            System.out.println("12. Validar longitud de cadena (entre min y max)");
            System.out.println("13. Reemplazar vocales por asteriscos");
            System.out.println("14. Contar palabras que contienen subcadena");
            System.out.println("15. Validar teléfono español");
            System.out.println("16. Extraer números de una cadena");
            System.out.println("17. Validar contraseña segura");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
            
	            case 0:
	            	
	                System.out.println("Saliendo del programa...");
	                
	                break;
	                
	            case 1:
                	
                    System.out.print("Introduce una palabra para agregar: ");
                    String nuevaPalabra = sc.nextLine();
                    manipulador.agregarPalabra(nuevaPalabra);
                    System.out.println("Palabra agregada.");
                    
                    break;

            
                case 2:
                	
                    System.out.println("\n Palabras actuales ");
                    manipulador.mostrarPalabras();
                    
                    break;

                case 3:
                	
                    System.out.println("\n Palabras ordenadas alfabéticamente ");
                    List<String> ordenadas = manipulador.ordenarAlfabeticamente();
                    ordenadas.forEach(System.out::println);
                    
                    break;

                case 4:
                	
                    System.out.print("Introduce la palabra a buscar: ");
                    String buscar = sc.nextLine();
                    Optional<String> resultado = manipulador.buscarCadena(buscar);
                    
                    if (resultado.isPresent()) {
                        System.out.println("Palabra encontrada: " + resultado.get());
                    } else {
                        System.out.println("Palabra no encontrada.");
                    }
                    
                    break;

                case 5:
                	
                    System.out.println("\n String formado por iniciales ");
                    String iniciales = manipulador.obtenerIniciales();
                    System.out.println("Iniciales: " + iniciales);
                    
                    break;

                case 6:
                	
                    System.out.println("\n Borrando palabras de longitud impar ");
                    manipulador.borrarPalabrasLongitudImpar();
                    System.out.println("Palabras con longitud par:");
                    manipulador.mostrarPalabras();
                    
                    break;

                case 7:
                	
                    System.out.println("\n Convirtiendo todas a mayúsculas ");
                    manipulador.convertirTodasAMayusculas();
                    manipulador.mostrarPalabras();
                    
                    break;

                case 8:
                	
                    System.out.print("Introduce una cadena para validar : ");
                    String cadenaLetras = sc.nextLine();
                    boolean soloLetras = manipulador.validarSoloLetras(cadenaLetras);
                    
                    if (soloLetras) {
                        System.out.println("La cadena contiene solo letras.");
                    } else {
                        System.out.println("La cadena contiene caracteres que no son letras.");
                    }
                    
                    break;

                case 9:
                	
                    System.out.print("Introduce un email para validar: ");
                    String email = sc.nextLine();
                    boolean emailValido = manipulador.validarEmail(email);
                    
                    if (emailValido) {
                        System.out.println("Email válido.");
                    } else {
                        System.out.println("Email no válido.");
                    }
                    
                    break;

                case 10:
                	
                    System.out.print("Introduce la letra inicial: ");
                    char letra = sc.nextLine().charAt(0);
                    List<String> porLetra = manipulador.buscarPorLetraInicial(letra);
                    
                    System.out.println("\n Palabras que empiezan por '" + letra + "' ");
                    if (porLetra.isEmpty()) {
                        System.out.println("No se encontraron palabras.");
                    } else {
                        porLetra.forEach(System.out::println);
                    }
                    
                    break;

                case 11:
                	
                    System.out.println("\n Palabras que contienen números ");
                    List<String> conNumeros = manipulador.extraerPalabrasConNumeros();
                    
                    if (conNumeros.isEmpty()) {
                        System.out.println("No hay palabras con números.");
                    } else {
                        conNumeros.forEach(System.out::println);
                    }
                    
                    break;

                case 12:
                	
                    System.out.print("Introduce una cadena: ");
                    String cadenaLong = sc.nextLine();
                    System.out.print("Longitud mínima: ");
                    int min = sc.nextInt();
                    System.out.print("Longitud máxima: ");
                    int max = sc.nextInt();
                    sc.nextLine();
                    
                    boolean longitudValida = manipulador.validarLongitud(cadenaLong, min, max);
                    
                    if (longitudValida) {
                        System.out.println("La longitud está entre " + min + " y " + max + " caracteres.");
                    } else {
                        System.out.println("La longitud NO está en el rango especificado.");
                    }
                    
                    break;

                case 13:
                	
                    System.out.print("Introduce una cadena: ");
                    String cadenaVocales = sc.nextLine();
                    String conAsteriscos = manipulador.reemplazarVocalesPorAsteriscos(cadenaVocales);
                    System.out.println("Resultado: " + conAsteriscos);
                    
                    break;

                case 14:
                	
                    System.out.print("Introduce la subcadena a buscar: ");
                    String subcadena = sc.nextLine();
                    long contador = manipulador.contarPalabrasQueContienen(subcadena);
                    System.out.println("Número de palabras que contienen '" + subcadena + "': " + contador);
                    
                    break;

                case 15:
                	
                    System.out.print("Introduce un número de teléfono: ");
                    String telefono = sc.nextLine();
                    boolean telefonoValido = manipulador.validarTelefonoEspanol(telefono);
                    
                    if (telefonoValido) {
                        System.out.println("Teléfono español válido.");
                    } else {
                        System.out.println("Teléfono no válido.");
                    }
                    
                    break;

                case 16:
                	
                    System.out.print("Introduce una cadena con números: ");
                    String cadenaNumeros = sc.nextLine();
                    List<String> numeros = manipulador.extraerNumeros(cadenaNumeros);
                    
                    System.out.println("Números encontrados:");
                    if (numeros.isEmpty()) {
                        System.out.println("No se encontraron números.");
                    } else {
                        numeros.forEach(System.out::println);
                    }
                    
                    break;

                case 17:
                	
                    System.out.print("Introduce una contraseña: ");
                    String password = sc.nextLine();
                    boolean passwordSegura = manipulador.validarContrasenaSegura(password);
                    
                    if (passwordSegura) {
                        System.out.println("Contraseña segura.");
                    } else {
                        System.out.println("Contraseña no cumple requisitos de seguridad.");
                    }
                    
                    break;

              


                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}






