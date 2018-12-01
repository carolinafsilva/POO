
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * Conta
 */
public class Conta {

    protected int numero;
    protected ArrayList<String> Titulares;
    protected LocalDate dataC;
    protected int saldo;
    protected ArrayList<String> acao;
    protected ArrayList<LocalDate> data;
    protected ArrayList<Integer> montante;

    public Conta(int numero, ArrayList<String> Titulares, int saldo) {
        this.numero = numero;
        this.Titulares = Titulares;
        this.dataC = LocalDate.now(ZoneId.of("Portugal"));
        this.saldo = saldo;
        acao = new ArrayList<>();
        data = new ArrayList<>();
        montante = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<String> getTitulares() {
        return Titulares;
    }

    public LocalDate getData() {
        return dataC;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitulares(ArrayList<String> Titulares) {
        this.Titulares = Titulares;
    }

    public void setData(LocalDate dataC) {
        this.dataC = dataC;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void novoMovimento(String acao, int montante) {
        LocalDate agora = LocalDate.now(ZoneId.of("Portugal"));
        this.acao.add(acao);
        this.montante.add(montante);
        this.data.add(agora);
    }

    public void setMovimentos(ArrayList<String> acao, ArrayList<Integer> montante, ArrayList<LocalDate> data) {
        for (String s : acao) {
            this.acao.add(s);
        }

        for (int i : montante) {
            this.montante.add(i);
        }

        for (LocalDate d : data) {
            this.data.add(d);
        }
    }
}
