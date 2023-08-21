package Recursion;
import java.util.Scanner;

public class sumatoriaRecursiva {
    static Scanner usuario = new Scanner(System.in);

    public static void main(String[] args){

        int numero;

        System.out.print("Sumar desde 1 hasta...(introduzca número entero): ");
        numero = usuario.nextInt();

        System.out.println("La suma de los enteros entre el 1 hasta el " + numero + ", es: " + sumaDeEnteros(numero));

    }
    public static int sumaDeEnteros(int numero){
        if (numero == 0){

            return numero;
        } else{

            return numero + sumaDeEnteros(numero - 1);
        }
    }
}
