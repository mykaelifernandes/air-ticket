package com.airticket.AirTicket;

import model.Pagamento;

public class TestePagamento {

        public static void main(String[] args) {
            // cria um objeto pagamento
            Pagamento pagamento = new Pagamento("1234567890123456",1000.00,false);

            // realiza o pagamento
            pagamento.realizarPagamento();

            // imprime o status do pagamento
            System.out.println("Status do pagamento: " + pagamento.statusPagamento());
        }

}
