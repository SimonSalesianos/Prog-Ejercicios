package ejercicio4;

public class Principal {

    public static void main(String[] args) {

        int a = 7;
        int b = 6; 

        try {
            int suma = a + b;

            if (suma > 10) {
                throw new SumaMayorQue10Exception("La suma no puede ser mayor que 10");
            }

            System.out.println("Suma OK: " + suma);

        } catch (SumaMayorQue10Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
