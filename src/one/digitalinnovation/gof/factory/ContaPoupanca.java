package one.digitalinnovation.gof.factory;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    private BigDecimal saldo = new BigDecimal(0);

    @Override
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposito(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Valor não deve ser menor que zero");
        }
        System.out.println("Depositado em conta poupança: "+ valor.toString());
        this.saldo = this.saldo.add(valor);
    }

    @Override
    public void saque(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Valor não deve ser menor que zero");
        }
        this.saldo = this.saldo.subtract(valor);
        System.out.println("Saque em conta poupança: "+ valor.toString());
    }

}
