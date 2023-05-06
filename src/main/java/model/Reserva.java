package model;
/*
representa uma reserva de um assento em um voo específico com o
 número do voo, número do assento e informações do passageiro.
 */
public class Reserva {
        private String numeroVoo;
        private String numeroAssento;
        private Cliente passageiro;

        // construtor
        public Reserva(String numeroVoo, String numeroAssento, Cliente passageiro) {
            this.numeroVoo = numeroVoo;
            this.numeroAssento = numeroAssento;
            this.passageiro = passageiro;
        }

        // getters e setters
        public String getNumeroVoo() {
            return numeroVoo;
        }

        public void setNumeroVoo(String numeroVoo) {
            this.numeroVoo = numeroVoo;
        }

        public String getNumeroAssento() {
            return numeroAssento;
        }

        public void setNumeroAssento(String numeroAssento) {
            this.numeroAssento = numeroAssento;
        }

        public Cliente getPassageiro() {
            return passageiro;
        }

        public void setPassageiro(Cliente passageiro) {
            this.passageiro = passageiro;
        }
    }

