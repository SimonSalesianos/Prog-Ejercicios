package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class OperacionesCadenas {
	
	
	  private List<String> palabras;

	   

	    public List<String> getPalabras() {
	        return palabras;
	    }

	    public void agregarPalabra(String palabra) {
	        palabras.add(palabra);
	    }

	    public List<String> ordenarAlfabeticamente() {
	        return palabras.stream()
	                .sorted()
	                .collect(Collectors.toList());
	    }

	    public Optional<String> buscarCadena(String cadenaBuscada) {
	        return palabras.stream()
	                .filter(p -> p.equalsIgnoreCase(cadenaBuscada))
	                .findFirst();
	    }

	    public String obtenerIniciales() {
	        return palabras.stream()
	                .filter(p -> !p.isEmpty())
	                .map(p -> String.valueOf(p.charAt(0)))
	                .collect(Collectors.joining());
	    }

	    public void borrarPalabrasLongitudImpar() {
	        palabras.removeIf(p -> p.length() % 2 != 0);
	    }

	    public void convertirTodasAMayusculas() {
	        palabras.replaceAll(String::toUpperCase);
	    }

	    public boolean validarSoloLetras(String cadena) {
	        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
	        Matcher matcher = pattern.matcher(cadena);
	        return matcher.matches();
	    }

	    public boolean validarEmail(String email) {
	        Pattern pattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	    public List<String> buscarPorLetraInicial(char letra) {
	        String regex = "^" + letra + ".*";
	        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        return palabras.stream()
	                .filter(p -> pattern.matcher(p).matches())
	                .collect(Collectors.toList());
	    }

	    public List<String> extraerPalabrasConNumeros() {
	        Pattern pattern = Pattern.compile(".*\\d+.*");

	        return palabras.stream()
	                .filter(p -> pattern.matcher(p).matches())
	                .collect(Collectors.toList());
	    }

	    public boolean validarLongitud(String cadena, int min, int max) {
	        String regex = "^.{" + min + "," + max + "}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(cadena);
	        return matcher.matches();
	    }

	    public String reemplazarVocalesPorAsteriscos(String cadena) {
	        return cadena.replaceAll("[aeiouAEIOU]", "*");
	    }

	    public long contarPalabrasQueContienen(String subcadena) {
	        Pattern pattern = Pattern.compile(".*" + Pattern.quote(subcadena) + ".*", Pattern.CASE_INSENSITIVE);

	        return palabras.stream()
	                .filter(p -> pattern.matcher(p).matches())
	                .count();
	    }

	    public boolean validarTelefonoEspanol(String telefono) {
	        Pattern pattern = Pattern.compile("^[679]\\d{8}$");
	        Matcher matcher = pattern.matcher(telefono);
	        return matcher.matches();
	    }

	    public List<String> extraerNumeros(String cadena) {
	        List<String> numeros = new ArrayList<>();
	        Pattern pattern = Pattern.compile("\\d+");
	        Matcher matcher = pattern.matcher(cadena);

	        while (matcher.find()) {
	            numeros.add(matcher.group());
	        }

	        return numeros;
	    }

	    public boolean validarContrasenaSegura(String contrasena) {
	        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
	        Matcher matcher = pattern.matcher(contrasena);
	        return matcher.matches();
	    }

	    public void mostrarPalabras() {
	        System.out.println("Palabras actuales en la lista:");
	        palabras.forEach(System.out::println);
	    }
	}

