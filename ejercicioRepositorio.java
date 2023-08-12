import java.util.Scanner;

public class ejercicioRepositorio {
    public static void main(String[] args){

        int num1, num2, num3;
        Scanner usuario = new Scanner(System.in);

        System.out.println("ingrese (en cualquier orden...) tres números enteros para averiguar cual es el mayor!");
        System.out.print("Primer número: ");
        num1 = usuario.nextInt();
        System.out.print("Segundo número: ");
        num2 = usuario.nextInt();
        System.out.print("Tercer número: ");
        num3 = usuario.nextInt();

        ordenar(num1, num2, num3);
    }


    public static void ordenar(int num1, int num2, int num3){
        String mje = "Mayor a menor: ";

        if(num1>num2) {
            if(num1>num3) {
                if(num2>num3) {
                    System.out.println(mje + num1 + " " + num2 + " " + num3);
                }else {
                    System.out.println(mje + num1 + " " + num3 + " " + num2);
                }
            }else {
                System.out.println(mje + num3 + " " + num1 + " " + num2);
            }
        }else {
            if(num2>num3) {
                if(num1>num3) {
                    System.out.println(mje + num2 + " " + num1 + " " + num3);
                }else {
                    System.out.println(mje + num2 + " " + num3 + " " + num1);
                }
            }else {
                System.out.println(mje + num3 + " " + num2 + " " + num1);
            }
        }
    }
}




