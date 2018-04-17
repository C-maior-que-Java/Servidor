package servidor.data;

public class Cardapio extends Dado {
	private int idCardapio;
	private Produto[] listaProdutos;
	
	public int getIdCardapio() {
		return idCardapio;
	}
	public void setIdCardapio(int idCardapio) {
		this.idCardapio = idCardapio;
	}
	public Produto[] getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(Produto[] listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
