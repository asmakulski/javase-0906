package homeWork;

public class Card {

    Suits suit;
    Ranks rank;

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String getDescription(){
        return getRank() + " " + getSuit();
    }

}
