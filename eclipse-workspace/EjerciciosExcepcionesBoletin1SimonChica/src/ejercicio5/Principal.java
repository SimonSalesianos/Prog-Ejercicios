package ejercicio5;

public class Principal {
    public static void main(String[] args) {

        ServiciosExcepciones s = new ServiciosExcepciones();

        try {
            for (int i = 0; i < 50; i++) {
                int n = s.generarAleatorioUnico(1, 10);
                System.out.println("Generado: " + n);
            }
        } catch (NumeroAleatorioRepetidoException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }

        try {
            Object o1 = new Object();
            Object o2 = new Object();
            s.asignarId(o1, 1);
            s.asignarId(o2, 1); 
        } catch (IdYaAsignadoException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }

        try {
            s.exigirPar(7);
        } catch (NumeroImparException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }

        try {
            s.pedirBizum(20.0, 50.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }

        try {
            System.out.println("División: " + s.dividir(10, 0));
        } catch (DivisionPorCeroException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }

        try {
            s.exigirTextoNoVacio("   ");
        } catch (TextoVacioException e) {
            System.out.println("OK (saltó): " + e.getMessage());
        }
    }
}
