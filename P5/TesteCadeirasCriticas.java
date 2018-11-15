public class TesteCadeirasCriticas {
    public static void main(String[] args) {

        CadeirasCriticas a = new CadeirasCriticas();
        CadeirasCriticas b = new CadeirasCriticas("Informatica");
        String curso;
        String[] novasCriticas = new String[3];

        System.out.println("Introduza o nome do curso de a:");
        curso = Ler.umaString();

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduza a disciplina " + (i + 1) + " de a:");
            novasCriticas[i] = Ler.umaString();
        }

        a.setCurso(curso);
        a.setDisciplinas(novasCriticas);

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduza a disciplina " + (i + 1) + " de b:");
            b.setDisciplinasIndex(Ler.umaString(), i);
        }

        System.out.println(a.toString());

        System.out.println("Curso a : " + b.getCurso());
        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina " + (i + 1) + " de a:" + b.getDisciplinasIndex(i));
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduza uma nova disciplina para " + a.getCurso() + ": ");
            novasCriticas[i] = Ler.umaString();
        }

        System.out.println(a.toString());

    }
}