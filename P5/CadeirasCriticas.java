public class CadeirasCriticas {
    private String curso;
    private String[] disciplinas = new String[3];

    public CadeirasCriticas() {
        this.curso = "";
        this.disciplinas = new String[3];
        for (int i = 0; i < 3; i++) {
            this.disciplinas[i] = "";
        }
    }

    public CadeirasCriticas(String curso) {
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplinas(String[] disciplinas) {
        for (int i = 0; i < 3; i++) {
            this.disciplinas[i] = disciplinas[i];
        }
    }

    public void setDisciplinasIndex(String s, int i) {
        this.disciplinas[i] = s;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public String getDisciplinasIndex(int i) {
        return disciplinas[i];
    }

    public String toString() {
        String s = "Curso: " + curso;
        for (int i = 0; i < 3; i++) {
            s += "\n";
            s += "Disciplina " + (i + 1) + ": ";
            s += disciplinas[i];
        }
        return s;
    }
}