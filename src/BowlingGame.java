import java.util.Arrays;

public class BowlingGame {


    //exemple de code non commenté, qui en plus renvoie des résultats justes seulement pour deux résultats de test
    //comment l'améliorer ? meilleurs choix de noms de fonctions et de variables.
    //nager dans du code dégueu c'est mon quotidien au taff, essayer de faire du code propre c'est mon quotidien sur mes projets persos.
    //regarde sur mon github pour des exemples...
    //désolé mais pas envie de faire beaucoup plus d'efforts sur ces exercices...
    int [] rolls = new int[20];
    int roll = 0;
    private int score = 0;


    public int score() {

        for ( int i = 0 ; i < rolls.length ; i++) {
            if (rolls[roll] == 10) {
                if (roll < 17) {
                    rolls[roll] += rolls[roll + 1] + rolls[roll + 2];
                }

            } else if (rolls[roll] == 9) {
                if (roll < 18) {
                    rolls[roll] += 10;
                    rolls[roll + 1] += 9;
                }

            } else

            score += rolls[i];
        }
        return score;
    }

    public void roll(int numberPins) {

        if (roll == 0) {
            Arrays.fill(rolls, 0);
        }

        rolls[roll] += numberPins;

        roll++;
    }

}
