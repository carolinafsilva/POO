public class Ex1d {
    public static void main(String[] args) {
        int n, valor;

        Contador positivo = new Contador();
        Contador negativo = new Contador();

        System.out.println("Introduza um valor:");
        n = Ler.umInt();

        for (int i = 0; i < n; i++) {
            valor = (int) (Math.random() * 200) - 100;
            System.out.println(valor);
            if (valor > 0) {
                positivo.incContador();
            }
            if (valor < 0) {
                negativo.incContador();
            }
        }
        System.out.println("Nº positivos: " + positivo.getContador());
        System.out.println("Nº negativo: " + negativo.getContador());
    }
}