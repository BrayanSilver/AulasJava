package Services;


import Models.ConsumoAgua;

    public class RelatorioAgua {

        public void exibirRelatorio(ConsumoAgua consumoAgua) {
            System.out.println("Relatório de Consumo de Água");
            System.out.println("Usuário: " + consumoAgua.getNomeUsuario());
            System.out.println("Consumo Diário: " + consumoAgua.getConsumoDiario() + " litros");
            System.out.println("Limite Diário: " + consumoAgua.getLimiteDiario() + " litros");

            if (consumoAgua.getConsumoDiario() > consumoAgua.getLimiteDiario()) {
                System.out.println("ALERTA: O consumo diário excedeu o limite!");
            } else {
                System.out.println("Consumo dentro do limite.");
            }
        }

        public static void main(String[] args) {
            ConsumoAgua usuario = new ConsumoAgua("Maria Oliveira", 10);

            usuario.setConsumoDiario(35);

            RelatorioAgua relatorio = new RelatorioAgua();
            relatorio.exibirRelatorio(usuario);
        }
    }

