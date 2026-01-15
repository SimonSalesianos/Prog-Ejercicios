package ejercicio3;

public class Cancion {

	
	   private String nombre;
	    private String autor;
	    private String genero;
	    private int duracionSegundos;

	    public Cancion(String nombre, String autor, String genero, int duracionSegundos) {
	        this.nombre = nombre;
	        this.autor = autor;
	        this.genero = genero;
	        this.duracionSegundos = duracionSegundos;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public int getDuracionSegundos() {
	        return duracionSegundos;
	    }

	    public void setDuracionSegundos(int duracionSegundos) {
	        this.duracionSegundos = duracionSegundos;
	    }

	}




	

