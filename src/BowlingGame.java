import java.util.Arrays;

public class BowlingGame {

    //exemple de code non commenté
    //comment l'améliorer ? meilleurs choix de noms de fonctions et de variables et commentaires...
    //nager dans du code dégueu c'est mon quotidien au taff, essayer de faire du code propre c'est mon quotidien sur mes projets persos.
    //regarde sur mon github pour des exemples...
    //désolé mais pas envie de faire beaucoup plus d'efforts sur ces exercices...



    private int[] rolls = new int[20];
    private int roll = 0;
    private int score = 0;


    public int score() {

        for ( int i = 0 ; i < 20; i++) {
            if (rolls[i] == 10) {
                if (i < 17) {
                    rolls[i] += rolls[i + 1] + rolls[i + 2];
                }

            } else if (rolls[i] == 9) {
                if (i < 18) {
                    rolls[i] += 10;
                    rolls[i + 1] += 9;
                }

            } else score += rolls[i];
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
