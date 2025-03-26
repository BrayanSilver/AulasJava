import java.util.ArrayList;

public class GerenciadorMedicamentos {
    private ArrayList<Medicamento> estoque;

    public GerenciadorMedicamentos() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        estoque.add(medicamento);
        System.out.println("Medicamento " + medicamento.getNome() + " adicionado com sucesso!");
    }

    public void listarMedicamentos() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum medicamento no estoque.");
        } else {
            for (Medicamento medicamento : estoque) {
                System.out.println("\n" + medicamento.exibirDetalhes());
            }
        }
    }

    public void atualizarQuantidadeEstoque(String codigoBarras, int novaQuantidade) {
        for (Medicamento medicamento : estoque) {
            if (medicamento.getCodigoBarras().equals(codigoBarras)) {
                medicamento.setQuantidadeEstoque(novaQuantidade);
                System.out.println("Quantidade do medicamento " + medicamento.getNome() + " atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Medicamento com o código de barras " + codigoBarras + " não encontrado.");
    }
}
