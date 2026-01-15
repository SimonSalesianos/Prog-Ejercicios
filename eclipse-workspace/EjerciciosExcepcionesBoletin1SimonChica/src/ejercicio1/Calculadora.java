package ejercicio1;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }

    public int raizEntera(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo.");
        }
        return (int) Math.sqrt(a);
    }
}
