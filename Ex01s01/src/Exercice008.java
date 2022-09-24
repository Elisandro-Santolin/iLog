package Exercices;

public class Exercice008 {
    public static void main(String[] args) {

        System.out.println("#### TABELA CAMPEONATO VÁRZEA - TABAJARA F.C ####");
        int victory = 12;
        int defeat = 2;
        int equal = 6;
        int victoryPoints = 3;
        int defeatPoints = 0;
        int equalPoints = 1;

        int calculeMatches = (victory + defeat + equal);
        int calculePoints = ((victory * victoryPoints) + (defeat * defeatPoints) + (equal * equalPoints));

        System.out.println("O time TABAJARA F.C, acumulou " + calculePoints + " após jogar " + calculeMatches + " partidas.");{

        }
    }
}
