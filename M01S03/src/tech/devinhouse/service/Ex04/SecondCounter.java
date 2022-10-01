package tech.devinhouse.service.Ex04;

public class SecondCounter {
    private String frase;

    public SecondCounter(String frase) {
        this.frase = frase;
    }
    public void contarPalavras() {
        String[] palavras = frase.split(" ");
        int numdPalavras = palavras.length;
        System.out.println("Qtd de palavras = " + numdPalavras);
    }
}

