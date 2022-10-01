package tech.devinhouse.service.Ex02;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Riddle", 100_548f);
        funcionario.aumentar(1000f);
        System.out.println(funcionario.getSalario());
    }
}
