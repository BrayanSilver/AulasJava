public class AprovacaoEmprestimo {

    public static String verificarAprovacao(Cliente cliente, Emprestimo emprestimo) {
        if (cliente.getRendaAnual() < 3 * emprestimo.getValor()) {
            return "Reprovado: Renda anual insuficiente.";
        }

        if (emprestimo.getValor() > 50000) {
            return "Reprovado: Valor do empréstimo excede o limite permitido.";
        }

        if (cliente.getIdade() <= 18) {
            return "Reprovado: Idade mínima não atingida.";
        }

        if (cliente.temEmprestimosPendentes().equalsIgnoreCase("Sim")) {
            return "Reprovado: Cliente possui empréstimos pendentes.";
        }

        if (emprestimo.getValor() > 0.3 * cliente.getRendaAnual()) {
            return "Reprovado: Valor do empréstimo excede 30% da renda anual.";
        }

        return "Aprovado: Empréstimo concedido.";
    }
}