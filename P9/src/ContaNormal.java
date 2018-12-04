
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * ContaNormal
 */
public class ContaNormal extends Conta {

    public ContaNormal(int numero, ArrayList<String> Titulares, int saldo) {
        super(numero, Titulares, saldo);
    }
    
    @Override
    public void novoMovimento(String acao, int montante) {
        if(saldo+montante>0){
            
        LocalDate agora = LocalDate.now(ZoneId.of("Portugal"));
        this.acao.add(acao);
        this.montante.add(montante);
        this.data.add(agora);
        }
        else {
            System.out.println("Erro: Saldo Insuficiente!");
        }  
    }
}