package miage.eall.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux = new ArrayList<>();

    public Partie(Jeu leJeu) {
            for(int i=0; i<10; i++){
                jeux.add(leJeu);
            }
            if( jeux.get(9).isSpare()){
                jeux.add(leJeu);
            }
            if( jeux.get(9).isStrike()){
                jeux.add(leJeu);
                if( jeux.get(10).isStrike()){
                    jeux.add(leJeu);
                }
            }
    }

    public int calculeScore() {
        int score = 0;

        for(int i=0; i<10 ;i++) {
            Jeu jeuCourant = jeux.get(i);
            score += jeuCourant.nombreQuilleTombees();

            if (jeuCourant.isSpare()) {
                score += jeux.get(i + 1).nombreQuillesTombeesLancer1();
            } else if (jeuCourant.isStrike()) {
                score += jeux.get(i + 1).nombreQuillesTombeesLancer1();
                if (jeux.get(i + 1).nombreQuillesTombeesLancer2()!= null) {
                    score += jeux.get(i + 1).nombreQuillesTombeesLancer2();
                } else {
                    score += jeux.get(i + 2).nombreQuillesTombeesLancer1();
                }
            }
        }

        return score;

    }
}