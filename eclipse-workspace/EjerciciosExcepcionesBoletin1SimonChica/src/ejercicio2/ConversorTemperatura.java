package ejercicio2;

public class ConversorTemperatura {
	
    private static  double minimo = -273.0; 

    public static double celsiusAFahrenheit(double celsius) throws TemperaturaInvalidaException {
    	
    	
        if (celsius < minimo) {
        	
            throw new TemperaturaInvalidaException("No puede haber temperaturas menores a -273 ºC");
        }
        
        return celsius * 1.8 + 32;
    }
}
