package one.digitalinnovation.gof.factory;

import java.math.BigDecimal;

public class ContaCorrente  extends Conta {

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
        this.saldo = this.saldo.add(valor);
        System.out.println("Depositado em conta corrente");
    }

    @Override
    public void saque(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Valor não deve ser menor que zero");
        }
        this.saldo = this.saldo.subtract(valor);
        System.out.println("Saque em conta corrente");
    }

}
