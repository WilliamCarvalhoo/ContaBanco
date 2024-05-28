import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(BigDecimal valor) {
        if (getSaldo().compareTo(valor) >= 0) {
            setSaldo(getSaldo().subtract(valor));
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        setSaldo(getSaldo().add(valor));
    }

    private void setSaldo(BigDecimal saldo) {
        // Reflete a lógica de atualização do saldo
    }
}
