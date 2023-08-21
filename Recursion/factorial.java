package Recursion;
import java.util.Scanner;

public class factorial {
    static Scanner usuario = new Scanner(System.in);

    public static void main(String[] args) {

        int enteroRecursivo;
        long enteroIterativo;


        System.out.print("Introduzca dos números enteros para saber su factorial!" + "\nForma recursiva: ");
        enteroRecursivo = usuario.nextInt();
        System.out.print("\nForma Iterativa: ");
        enteroIterativo = usuario.nextLong();

        System.out.println("El factorial de " + enteroRecursivo + ", de forma recursiva, es: " +
                calcularFactorial(enteroRecursivo) + ". Y el de " + enteroIterativo + " de forma iterativa es: " + calcularFactorial(enteroIterativo));
    }

    public static int calcularFactorial(int enteroR){

        if(enteroR <= 1){

            return 1;
        } else{

            return enteroR * calcularFactorial(enteroR - 1);
        }
    }

    public static long calcularFactorial(long enteroI) {

        long fact = 1;

        if (enteroI < 0) {

            enteroI = enteroI * (-1);
        } else if (enteroI == 0) {

            return 1;
        }

        for (int i = 1; i <= enteroI; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

