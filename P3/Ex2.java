import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número ");
        int num = teclado.nextInt();
        System.out.println("o número digitado: " + num);

        System.out.println("Digite um double ");
        double x = teclado.nextDouble();
        System.out.println("o double digitado: " + x);

        System.out.println("Digite um boolean ");
        boolean a = teclado.nextBoolean();
        System.out.println("o boolean digitado: " + a);

        System.out.println("Digite uma string ");
        teclado.nextLine();
        String s = teclado.nextLine();
        System.out.println("A string digitada: " + s);
    }
}