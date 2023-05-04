package com.mycompany.classesumes;

/**
 *
 * @author danilopez
 */
public class ClasseMates {

    // Método para calcular el factorial de un número entero positivo
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Método para calcular la suma de los primeros n términos de la serie de Fibonacci
    public int sumaFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += b;
            int c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }

    // Método para calcular una división
    public int division(int a, int b) {
        return a / b;
    }
}
