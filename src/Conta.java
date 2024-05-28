import java.math.BigDecimal;

public abstract class Conta {
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private BigDecimal saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = 1; // Pode ser configurável
        this.numero = SEQUENCIAL++;
        this.saldo = BigDecimal.ZERO;
        this.cliente = cliente;
    }

    // Métodos abstratos
    public abstract void sacar(BigDecimal valor);

    public abstract void depositar(BigDecimal valor);

    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getters e Setters

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
