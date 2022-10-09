package tech.devinhouse.exercicios.Ex03;

public class Produto implements Tributacao {
    private double valor;
    private double valorTributo;


    @Override
    public double calculaTributo() {return this.valor + valorTributo;}
}
