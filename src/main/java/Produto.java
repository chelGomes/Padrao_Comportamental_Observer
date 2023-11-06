import java.util.Observable;

public class Produto extends Observable {
    private String nomeProduto;
    private double preco;
    private String descricaoProduto;
    private String codigo;

    public Produto(String nomeProduto, double preco, String descricaoProduto, String codigo) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.descricaoProduto = descricaoProduto;
        this.codigo = codigo;
    }

    public void lancarProduto(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto=" + nomeProduto +
                ", preco=" + preco +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
