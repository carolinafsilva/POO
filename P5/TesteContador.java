public class TesteContador {
    public static void main(String[] args) {
        Contador a = new Contador();
        Contador b = new Contador(10);

        System.out.println(a.toString());
        System.out.println(b.toString());

        a.incContador();
        b.incContador(5);

        System.out.println("Conta: " + a.getContador());
        System.out.println("Conta: " + b.getContador());
    }
}