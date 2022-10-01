package tech.devinhouse.service.Ex03;

public class Counter {

    public static void contarPalavras(String frase) {
        String[] palavras = frase.split(" ");
        int numPalavras = palavras.length;
    System.out.println("Quantidade de Palavras= " + numPalavras);
    }
}

