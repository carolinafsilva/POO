import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader canal;
        canal = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escreva um inteiro: ");

        String s = canal.readLine();
        int i = Integer.parseInt(s);

        System.out.println("O inteiro foi: " + i);

        System.out.println("Escreva um double: ");

        String t = canal.readLine();
        double j = Double.parseDouble(t);

        System.out.println("O double foi: " + j);

        System.out.println("Escreva um boolean: ");

        String v = canal.readLine();
        boolean k = Boolean.parseBoolean(v);

        System.out.println("O boolean foi: " + k);

    }
}