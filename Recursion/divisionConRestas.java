import java.util.Scanner;

public class divisionConRestas {
    static Scanner usuario = new Scanner(System.in);        //declaración global de "Scanner"

    public static void main(String[] args){     //método main

        int dividendoRecursivo, divisorRecursivo, dividendoIterativo, divisorIterativo;     //declaración variables
                                                                                            //dividendos y divisores
        System.out.print("introduzca el dividendo para la división recursiva: ");
        dividendoRecursivo = usuario.nextInt();                                         //asignación de valores por teclado
        System.out.print("introduzca el divisor para la división recursiva: ");         //para división recursiva
        divisorRecursivo = usuario.nextInt();

        //mostrar en pantalla resultado de la división recursiva llamando al método y enviando los valores por parámetro

        System.out.println("El resultado de la división recursiva es: " +
                divisionRecursiva(dividendoRecursivo, divisorRecursivo));

        System.out.print("introduzca el dividendo para la división Iterativa: ");
        dividendoIterativo = usuario.nextInt();                                         //asignación de valores por teclado
        System.out.print("introduzca el divisor para la división Iterativa: ");         //para división con restas iteradas
        divisorIterativo = usuario.nextInt();

        //mostrar en pantalla resultado de la división iterativa llamando al método y enviando los valores por parámetro

        System.out.println("El resultado de la división Iterativa es: " +
                divisionIterada(dividendoIterativo, divisorIterativo));

    }

    public static int divisionRecursiva(int dividendo, int divisor){    //método recursivo para dividir

        if (divisor > dividendo){       //cuando el divisor es mayor al número a dividir...
                                        //
            return 0;                   //el resultado es 0.
        } else {
                                                                                //caso contrario, el método se llama a si
                                                                                //mismo, restando al dividendo el valor
            return 1 + (divisionRecursiva(dividendo-divisor, divisor));//del divisor las veces necesarias
        }
    }

    public static int divisionIterada(int dividendo, int divisor) {     //método con divisiones iteradas para dividir
        int resultado = 0;      //resultado y contador inicializado a 0.

        if (divisor > 0) {      //comparador para saber si el divisor es mayor a 0 y así la división sea posible

            while (dividendo - divisor >= 0) {      //método iterativo que lleva la cuenta del resultado a medida que
                dividendo = dividendo - divisor;    //realiza las restas
                resultado++;
            }
        } else {
            System.out.println("Error! No se puede dividir entre cero!");   //aviso de división imposible
        }
        return resultado;           //retorno del contador/resultado de la división
    }


}