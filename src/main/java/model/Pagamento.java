package model;
/*
pagamento de uma passagem aérea com informações do cartão, preço da passagem e status de pagamento.
 */
public class Pagamento {
    private String cartao;
    private double precoPassagem;
    private boolean statusPagamento;

    public Pagamento(String cartao,double precoPassagem,boolean statusPagamento) {
        this.cartao = cartao;
        this.precoPassagem = precoPassagem;
        this.statusPagamento = statusPagamento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void realizarPagamento() {
        // lógica para realizar pagamento
        // ...
        this.statusPagamento = true;
    }

    // método para verificar o status do pagamento
    public String statusPagamento() {
        if (this.statusPagamento) {
            return "Pagamento realizado";
        } else {
            return "Pagamento pendente";
        }
    }
}


