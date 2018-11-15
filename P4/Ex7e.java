public class Ex7e {
    public static void main(String[] args) {
        int p, u, soma = 0;

        System.out.println("Introduza o valor de p:");
        p = Ler.umInt();
        System.out.println("Introduza o valor de u:");
        do {
            u = Ler.umInt();
        } while (u < p);

        for (int i = p; i <= u; i++) {
            soma += i;
        }

        System.out.println(soma);
    }
}