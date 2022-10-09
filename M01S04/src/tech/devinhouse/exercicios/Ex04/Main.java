package tech.devinhouse.exercicios.Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean idadeValida = false;
        Integer idade = null;

        while(!idadeValida){
            System.out.print("Informe sua idade: ");
            Scanner scanner = new Scanner(System.in);
            String retorno = scanner.nextLine();
            try {
                idade = Integer.valueOf(retorno);
                if(idade <= 0 || idade > 100){
                    throw new RetornoInvalida();
                }
                idadeValida = true;
            }catch (NumberFormatException e) {
                System.out.println("Digite um valor valido! Esse não numerico");
            }catch (RetornoInvalida e){
                System.out.println("Idade não identificada!");
            }
        }
        System.out.println("Idade informada: " + idade);
    }
}
