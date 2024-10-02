package one.digitalinnovation.gof.factory;

import java.math.BigDecimal;

public abstract class Conta {
    public abstract BigDecimal getSaldo();
    public abstract void deposito(BigDecimal valor);
    public abstract void saque(BigDecimal valor);
}
