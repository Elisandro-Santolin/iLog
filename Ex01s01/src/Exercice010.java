package Exercices;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercice010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digìte o seu ano de nascimento: ");
                int yearBirth = scanner.nextInt();
       LocalDate today = LocalDate.now();
                int yearNow = today.getYear();
                int calcule = (yearNow - yearBirth);

            System.out.println("Sua idade atual é: " + calcule);

    }
}
