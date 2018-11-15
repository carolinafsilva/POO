public class Totoloto2 {
    public static void main(String[] args) {
        int[] chave = new int[6];
        boolean flag;
        for (int i = 0; i < 6; i++) {
            do {
                flag = false;
                chave[i] = (int) (Math.random() * 49) + 1;
                for (int k = 0; k < i; k++) {
                    if (chave[i] == chave[k]) {
                        flag = true;
                        break;
                    }
                }
            } while (flag);
            System.out.print(chave[i] + " ");
        }
        System.out.println();
    }
}