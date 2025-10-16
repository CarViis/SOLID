/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    public void processar(Pedido pedido, Banco banco, Email email) {
        // 1. Responsabilidade: Calcular o total
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: " + total);

        // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println("Processando pagamento via Cartão de Crédito...");
            // Lógica específica para cartão
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println("Processando pagamento via Boleto Bancário...");
            // Lógica específica para boleto
        }

        banco.salvar(pedido);

        email.enviarEmail();
    }
}