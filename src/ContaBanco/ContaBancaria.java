package ContaBanco;

public class ContaBancaria {

    String nome;
    int numeroConta;
    double saldo;

    // Construtor
    public ContaBancaria(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito inválido");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saque inválido");
        }
    }
}
