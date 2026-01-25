package ejercicio5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ServiciosExcepciones {

    private Set<Integer> generados = new HashSet<>();
    private Map<Integer, Object> ids = new HashMap<>();

    public int generarAleatorioUnico(int min, int max) throws NumeroAleatorioRepetidoException {
        int n = (int) (Math.random() * (max - min + 1)) + min;

        if (!generados.add(n)) {
            throw new NumeroAleatorioRepetidoException("Número aleatorio repetido: " + n);
        }
        return n;
    }

    public void asignarId(Object obj, int id) throws IdYaAsignadoException {
    	
        if (ids.containsKey(id) && ids.get(id) != obj) {
            throw new IdYaAsignadoException("El id " + id + " ya está asignado a otro objeto.");
        }
        ids.put(id, obj);
    }

    public void exigirPar(int n) throws NumeroImparException {
    	
        if (n % 2 != 0) {
            throw new NumeroImparException("El número es impar: " + n);
        }
    }

    public void pedirBizum(double saldo, double cantidad) throws SaldoInsuficienteException {
    	
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "Saldo insuficiente. Saldo=" + saldo + "€, pedido=" + cantidad + "€"
            );
        }
    }

    public double dividir(double a, double b) throws DivisionPorCeroException {
    	
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir entre 0.");
        }
        return a / b;
    }

    public void exigirTextoNoVacio(String s) throws TextoVacioException {
    	
        if (s == null || s.trim().isEmpty()) {
        	
            throw new TextoVacioException("El texto no puede estar vacío.");
        }
    }
}
