public class Ex12 {
    public static void main(String[] args) {
        int[][] m = new int[2][3];
        int nImpar = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Ler.umInt();
                if (m[i][j] % 2 != 0) {
                    nImpar++;
                }
            }
        }
        System.out.println("Temos " + nImpar + " numeros impares.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }
}