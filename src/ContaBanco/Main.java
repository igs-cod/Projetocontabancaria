package ContaBanco;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(12345, "João Silva", 1000.00);

        // Exibindo o saldo inicial
        System.out.println("Saldo inicial: " + minhaConta.saldo);

        // Depositando dinheiro
        minhaConta.depositar(500.00);

        // Sacando dinheiro
        minhaConta.sacar(300.00);

        // Exibindo o saldo final
        System.out.println("Saldo final: " + minhaConta.saldo);
    }
}
