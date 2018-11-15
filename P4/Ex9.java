public class Ex9 {

    private static int maior(int a, int b, int c) {
        return (a > b && a > c ? a : b > c ? b : c);
    }

    public static void main(String[] args) {
        int a, b, c;
        a = Ler.umInt();
        b = Ler.umInt();
        c = Ler.umInt();

        System.out.println(maior(a, b, c));
    }

}