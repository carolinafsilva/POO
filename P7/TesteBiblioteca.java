/**
 * TesteBiblioteca
 */
public class TesteBiblioteca {

    public static void main(String[] args) {
        Biblioteca a = new Biblioteca();
        String x;

        System.out.println("Introduza o nome da biblioteca:");
        a.setNome(Ler.umaString());

        a.inserirLivro("livro1");
        a.inserirLivro("livro2");

        System.out.println(a);

        System.out.println("Introduza o nome do livro a pesquisar:");
        if (a.temLivro(Ler.umaString())) {
            System.out.println("O livro está na biblioteca");
        } else {
            System.out.println("O livro não está na biblioteca");
        }

        System.out.println("Introduza o nome do livro a remover:");
        x = Ler.umaString();
        if (a.temLivro(x)) {
            a.removerLivro(x);
        } else {
            System.out.println("O livro não está na biblioteca");
        }
        System.out.println(a);

        System.out.println(a.equals((Object) a.clone()));
    }
}