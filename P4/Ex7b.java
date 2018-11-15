public class Ex7b {
    public static void main(String[] args) {
        int p, u, soma = 0;

        System.out.println("Introduza o valor de p:");
        p = Ler.umInt();
        System.out.println("Introduza o valor de u:");
        u = Ler.umInt();

        while (p <= u) {
            soma += p;
            p++;
        }

        System.out.println(soma);
    }
}