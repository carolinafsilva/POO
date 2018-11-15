public class Ex7a {
    public static void main(String[] args) {
        int p, u, soma = 0;

        System.out.println("Introduza o valor de p:");
        p = Ler.umInt();
        System.out.println("Introduza o valor de u:");
        u = Ler.umInt();

        for (int i = p; i <= u; i++) {
            soma += i;
        }

        System.out.println(soma);
    }
}