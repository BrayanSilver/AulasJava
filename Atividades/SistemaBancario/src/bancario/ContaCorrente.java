package bancario;

public class ContaCorrente extends Conta {
    private static final double TARIFA_MENSAL = 15.00;

    public ContaCorrente(int numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public double calcularImposto() {
        return TARIFA_MENSAL;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Conta Corrente");
        System.out.println("Número: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Tarifa mensal: R$" + TARIFA_MENSAL);
    }
}