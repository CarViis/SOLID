// Classe que representa o Pedido
class Pedido {
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private TipoDePagamento tipoPagamento;

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public java.util.List<Item> getItens() {
        return itens;
    }

    public TipoDePagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoDePagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}