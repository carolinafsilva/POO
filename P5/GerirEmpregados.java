import javax.swing.undo.UndoManager;

public class GerirEmpregados {

    public static int encontrarEmpregado(Empregado[] a, int ss) {
        int pos = Empregado.getNumEmpregados();
        for (int i = 0; i < pos; i++) {
            if (a[i].getSegSocial() == ss) {
                return i;
            }
        }
        return -1;
    }

    public static void apagarEmpregado(Empregado[] a, int pos) {
        for (int i = pos; i < Empregado.getNumEmpregados(); i++) {
            a[i] = a[i + 1];
        }
        Empregado.apagarEmpregado();
    }

    public static void main(String[] args) {
        int op, pos, segSocial = 0, salario = 0;
        String nome = "";
        Empregado[] empresa = new Empregado[20];
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 – Criar empregado");
            System.out.println("2 – Consultar todos os empregados");
            System.out.println("3 – Modificar um empregado");
            System.out.println("4 – Apagar um empregado");
            System.out.println("5 - Sair.");

            op = Ler.umInt();
            switch (op) {
            case 1:

                System.out.println("Numero de segurança social:");
                segSocial = Ler.umInt();
                System.out.println("Nome:");
                nome = Ler.umaString();
                pos = Empregado.getNumEmpregados();
                empresa[pos] = new Empregado(segSocial, nome);
                break;
            case 2:
                pos = Empregado.getNumEmpregados();
                for (int i = 0; i < pos; i++) {
                    System.out.println("Numero de segurança social:" + empresa[i].getSegSocial() + "  Nome: "
                            + empresa[i].getNome() + "  Salario: " + empresa[i].getSalario());
                }
                break;
            case 3:
                System.out.println("Introduza o numero de s social do empregado a alterar");
                pos = encontrarEmpregado(empresa, Ler.umInt());
                System.out.println("Introduza o novo numero de s social: ");
                segSocial = Ler.umInt();
                System.out.println("Introduza o novo nome: ");
                nome = Ler.umaString();
                System.out.println("Introduza o novo salario:");
                salario = Ler.umInt();

                empresa[pos].setSegSocial(segSocial);
                empresa[pos].setNome(nome);
                empresa[pos].setSalario(salario);
                break;
            case 4:
                System.out.println("Introduza o numero de s social do empregado a alterar");
                pos = encontrarEmpregado(empresa, Ler.umInt());
                apagarEmpregado(empresa, pos);

                break;
            }
        } while (op != 5);

    }
}