package Models;

    public class ConsumoAgua {
        private String nomeUsuario;
        private double consumoDiario;
        private double limiteDiario;

        // Construtor
        public ConsumoAgua(String nomeUsuario, double limiteDiario) {
            this.nomeUsuario = nomeUsuario;
            this.setLimiteDiario(limiteDiario);
            this.consumoDiario = 0;
        }

        // Getters e Setters
        public String getNomeUsuario() {
            return nomeUsuario;
        }

        public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
        }

        public double getConsumoDiario() {
            return consumoDiario;
        }

        public void setConsumoDiario(double consumoDiario) {
            if (consumoDiario >= 0) {
                this.consumoDiario = consumoDiario;
            } else {
                System.out.println("Erro: O consumo diário não pode ser negativo.");
            }
        }

        public double getLimiteDiario() {
            return limiteDiario;
        }

        public void setLimiteDiario(double limiteDiario) {
            if (limiteDiario >= 10) {
                this.limiteDiario = limiteDiario;
            } else {
                System.out.println("Erro: O limite diário não pode ser menor que 10 litros.");
            }
        }
    }

