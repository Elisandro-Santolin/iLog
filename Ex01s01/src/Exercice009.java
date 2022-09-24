package Exercices;

import java.util.Scanner;

public class Exercice009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey! Qual o seu herói favorito? ");
        String nameHero = scanner.nextLine();

        System.out.println("Ual que legal! " + nameHero + ", é o meu herói favorito também.");
    }
}
