package bancario;

public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO_ANUAL = 0.05; // 5% ao ano
    private static final double TAXA_IMPOSTO = 0.005; // 0.5% sobre o saldo

    public ContaPoupanca(int numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public double calcularImposto() {
        return saldo * TAXA_IMPOSTO;
    }

    public void aplicarRendimento() {
        double rendimento = saldo * (TAXA_RENDIMENTO_ANUAL / 12); // Rendimento mensal
        saldo += rendimento;
        System.out.println("Rendimento de R$" + rendimento + " aplicado.");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Conta Poupança");
        System.out.println("Número: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Taxa de rendimento anual: " + (TAXA_RENDIMENTO_ANUAL * 100) + "%");
        System.out.println("Imposto sobre saldo: " + (TAXA_IMPOSTO * 100) + "%");
    }
}