public class Ex13 {
    public static void main(String[] args) {
        int n;
        System.out.println("Introduza um numero:");
        n = Ler.umInt();
        do {
            System.out.print(n % 10);
            n = n / 10;
        } while (n > 0);
        System.out.println();
    }
}