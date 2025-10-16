/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    public void processar(Pedido pedido, Banco banco) {
        
        CalculadoraTotal.calcularTotal(pedido);
        pedido.getTipoPagamento().processarPagamento();
        banco.salvar(pedido);
        Email.enviarEmail();
    }
}