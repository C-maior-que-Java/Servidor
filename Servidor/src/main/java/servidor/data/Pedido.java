package servidor.data;

public class Pedido {

    private int idPedido;
    private Produto[] listaProdutos;

    public Pedido(int idPedido, Produto[] listaProdutos) {
        this.idPedido = idPedido;
        this.listaProdutos = listaProdutos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Produto[] getListaProdutos() {
        return listaProdutos;
    }
}
