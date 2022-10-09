package tech.devinhouse.exercicios.Ex01;

public class ContaCorrente extends Conta implements Operativo {
    private double saldo;


    @Override
    protected double CapturarSaldo() {return saldo;}


    @Override
    public void deposito(double valor) {this.saldo = (saldo + valor);}

    @Override
    public double saque(double valor) {
        saldo = saldo - valor;
        return saldo;
    }
}

