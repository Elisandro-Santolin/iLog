package tech.devinhouse.service.Ex01;

import tech.devinhouse.service.Ex01.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setFullName("Tom Riddle");
        funcionario.setCpf(12345678900L);
        funcionario.setWage(300.0f);
        funcionario.setPromote(15);
        System.out.println(funcionario.getWage());

    }
}
