
import java.time.LocalDate;
import java.time.ZoneId;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carolinasilva
 */
public class ContaAPrazo {
    private float juros;
    private int prazo; // insto não devia ser uma data?

    public ContaAPrazo(float juros, int prazo) {
        this.juros = juros;
        this.prazo = prazo;
    }

    public float getJuros() {
        return juros;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public void novoMovimento(String acao, int montante) {
        LocalDate agora = LocalDate.now(ZoneId.of("Portugal"));
        this.acao.add(acao);
        montante.add(montante); // wut? did you mean su ahahahah, nao faço ideia o que estava a fazer xD
        super.data.add(agora);
    }
}
