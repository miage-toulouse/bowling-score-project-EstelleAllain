package miage.eall.bowling;

public class Jeu{
    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer2, Integer lancer1) {
        this.lancer2 = lancer2;
        this.lancer1 = lancer1;
    }

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }


    public Integer nombreQuilleTombees() {
        if(lancer2 != null){
            return lancer1 + lancer2 ;
        }else {
            return lancer1;
        }

    }

    public boolean isSpare(){
        return (lancer2 != null && lancer1 + lancer2 ==10) ;
    }

    public Integer nombreQuillesTombeesLancer1() {
        return lancer1 ;
    }

    public boolean isStrike(){
        return lancer1 ==10 ;
    }
    public Integer nombreQuillesTombeesLancer2() {
        return lancer2 ;
    }
}