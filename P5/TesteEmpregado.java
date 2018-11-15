public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado a = new Empregado();
        Empregado b = new Empregado(123, "Carolina");

        a.setSegSocial(121);
        a.setNome("Ana");
        a.setSalario(1000);

        System.out.println("Nome de a: " + a.getNome());
        System.out.println("Salario de a: " + a.getSegSocial());
        System.out.println("Salario de a: " + a.getSalario());

        System.out.println("Nome de b: " + b.getNome());
        System.out.println("Salario de b: " + b.getSegSocial());
        System.out.println("Salario de b: " + b.getSalario());

        b.aumentarSalario((float) 0.2);

        System.out.println("Salario de b: " + b.getSalario());
    }
}