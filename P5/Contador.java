public class Contador {
    private int conta;

    public Contador() {
        conta = 0;

    }

    public Contador(int conta) {
        this.conta = conta;
    }

    public void incContador() {
        conta++;
    }

    public void incContador(int n) {
        conta += n;
    }

    public void decContador() {
        conta--;
    }

    public void decContador(int n) {
        conta -= n;
    }

    public int getContador() {
        return conta;
    }

    public String toString() {
        String s = "Conta: " + conta;
        return s;
    }
}
