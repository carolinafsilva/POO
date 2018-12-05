import java.util.ArrayList;

/**
 * TesteContas
 */
public class TesteContas {

    public static void main(String[] args) {

        ArrayList<String> titulares1 = new ArrayList<String>();
        titulares1.add("João");
        titulares1.add("Carolina");

        ArrayList<String> titulares2 = new ArrayList<String>();
        titulares2.add("Sushi");
        titulares2.add("Piaf");
        titulares2.add("Nunca me lembro do nome do teu gato");

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(new ContaVencimento(0, titulares1, 1000000000, -2500, 123456789)); // $$$
        contas.add(new ContaAPrazo(1, titulares2, 2000));

        for (Conta c : contas) {

            c.novoMovimento("Comprar gomas", -2);
            c.novoMovimento("Comprar uma mansao", -3000000);
            c.novoMovimento("Pagar propinas", -1000);
            c.novoMovimento("Receber ordenado", 25000000);
            c.novoMovimento("Construir um free shelter for homeless animals", -25000000);

            System.out.println(c.getUltimosMovimentos(3));
            System.out.println(c.getUltimosMovimentos(4));
            System.out.println(c.getUltimosMovimentos(10));

            if (c instanceof ContaAPrazo) {
                ContaAPrazo nc = (ContaAPrazo) c;
                nc.addJuros();
            }
        }

        // meh não me apetece testar mais sorry (os testes tambem não estão nada
        // visuais)

    }
}