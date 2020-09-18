import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Result  resultado = new Result();
        Arithmetic calculo = new Arithmetic();

        double a;
        double b;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        a = keyboard.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        b = keyboard.nextDouble();

        calculo.sum(resultado, a, b);
        double sumResult = resultado.getResultSum();
        System.out.println("El resultado de la suma es: " + sumResult);

        calculo.substraction(resultado, a, b);
        double substractionResult = resultado.getResultSubstraction();
        System.out.println("El resultado de la sustraccion es: " + substractionResult);

        calculo.multiplication(resultado, a, b);
        double multiplicationResult = resultado.getResultMultiplication();
        System.out.println("El resultado de la multiplicacion es: " + multiplicationResult);

        calculo.division(resultado, a, b);
        double divisionResult = resultado.getResultDivison();
        System.out.println("El resultado de la division es: " + divisionResult);

    }

}
