public class Ex11 {

    private static double[] lerVetor(int n) {
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = Ler.umDouble();
        }
        return v;
    }

    private static void printVetor(double[] v) {
        for (double i : v) {
            System.out.println(i);
        }
    }

    private static double produtoInterno(double[] v, double[] u) {

        double x = 0.0;
        for (int i = 0; i < v.length; i++) {
            x += v[i] * u[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Introduza o tamanho do array");
        n = Ler.umInt();
        double[] v = lerVetor(n);
        double[] u = lerVetor(n);
        printVetor(v);
        printVetor(u);
        System.out.println(produtoInterno(v, u));
    }
}