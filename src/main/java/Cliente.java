import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nomeCliente;
    private String endereco;
    private String ultimaNotificacao;

    public Cliente(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    public void cadastrar(Produto produto){
        produto.addObserver(this);
    }

    public void update(Observable produto, Object arg1) {
        this.ultimaNotificacao = this.nomeCliente + ", produto cadastrado em " + produto.toString();
    }
}
