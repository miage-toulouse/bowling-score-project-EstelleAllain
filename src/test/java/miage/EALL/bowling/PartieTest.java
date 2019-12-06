package miage.EALL.bowling;

import miage.eall.bowling.Jeu;
import miage.eall.bowling.Partie;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalculeScoreSansStrikeSansSpare(){
        // given : une partie avec 10 jeux identiques faisant tomber 5 quilles sur les deux lancers
        Jeu leJeu = new Jeu(5,0);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        int score = laPartie.calculeScore();
        // then : on obtient un score de 50
        assertEquals(50,score);
    }


    @Test
    public void testCalculeScoreAvecQueDesSpares(){
        // iven : une partie avec 10 jeux identiques correspondant à des spares 5-5
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        int score = laPartie.calculeScore();
        // then : on obtient un score de 150
        assertEquals(150,score);
    }

    @Test
    public void testCalculeScoreAvecQueDesStrikes(){
        // iven : une partie avec 10 jeux identiques correspondant à des strikes
        Jeu leJeu = new Jeu(10);
        Partie laPartie = new Partie(leJeu);
        // when : on calcule le score
        int score = laPartie.calculeScore();
        // then : on obtient un score de 150
        assertEquals(300,score);
    }

}