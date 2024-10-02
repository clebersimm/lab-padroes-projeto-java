package one.digitalinnovation.gof.factory;

public class ContaFactory {
    public static Conta abrirConta(String tipo){
        if(tipo.equals("CONTA_CORRENTE")){
            return new ContaCorrente();
        } else if(tipo.equals("CONTA_POUPANCA")) {
            return new ContaPoupanca();
        }
        return null;
    }
}
