public class Ex10 {

    private static char maior(String s) {
        char m = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > m)
                m = s.charAt(i);
        }

        return m;
    }

    public static void main(String[] args) {
        String s;
        s = Ler.umaString();

        System.out.println(maior(s));
    }
}