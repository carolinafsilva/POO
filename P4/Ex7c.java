public class Ex7c {
    public static void main(String[] args) {
        int p, u, soma = 0;

        System.out.println("Introduza o valor de p:");
        p = Ler.umInt();
        System.out.println("Introduza o valor de u:");
        u = Ler.umInt();

        do {
            soma += p;
            p++;
        } while (p <= u);

        System.out.println(soma);
    }
}