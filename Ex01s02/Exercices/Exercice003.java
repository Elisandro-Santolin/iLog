package Exercices;

public class Exercice003 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };
            for(int i = 0; i < extrato.length;  i++){
            System.out.println(extrato[i]);
        }   for (int i=extrato.length-1; i >= 0; i--) {
           System.out.println(extrato[i]);
        }
        int saldoFinal = 0;
            for(int i = 0; i < extrato.length; i++) {
            saldoFinal += extrato[i];
        }System.out.println(saldoFinal);
            if (saldoFinal > 0) {
            System.out.println("O seu saldo no momento é positivo!!");
        }   else {
            System.out.println("O seu saldo no momento é negativo!!");
        }
    }
}
