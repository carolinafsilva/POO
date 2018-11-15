public class Empregado {
    private int segSocial;
    private String nome;
    private float salario;
    private static int numEmpregados = 0;

    public Empregado() {
        segSocial = 0;
        nome = "";
        salario = (float) 500;
        numEmpregados++;
    }

    public Empregado(int segSocial, String nome) {
        this.segSocial = segSocial;
        this.nome = nome;
        this.salario = (float) 500;
        numEmpregados++;
    }

    public int getSegSocial() {
        return segSocial;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public static int getNumEmpregados() {
        return numEmpregados;
    }

    public void setSegSocial(int segSocial) {
        this.segSocial = segSocial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString() {
        String s = "Nº segurança social: " + segSocial + "Nome: " + nome + "Salario" + salario;
        return s;
    }

    public void aumentarSalario(float percentagem) {
        salario = salario + (salario * percentagem);
    }

    public static void apagarEmpregado() {
        numEmpregados--;
    }
}