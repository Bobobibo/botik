import java.util.* ;
// import java.util.Scanner;


public class Card {
    String symbol;
    String value;
    //private static final String[] values;
    // private static final String[] symbols;
    //  static{
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
    String[] symbols = {"Hearts ", "Diamonds ", "Clubs ", "Spades "};

    // }
    Random rand = new Random();

    public class card {
        String value;
        String symbol;


    }

    public card getCards() {

        card card = new card();
        int card1 = rand.nextInt(14);
        int mast = rand.nextInt(4);
        card.value = values[card1];
        card.symbol = symbols[mast];
        // System.out.println(this.value+this.symbol);

        return card;

    }

    public Integer getValue(card card) {
        if (card.value.equals("K") || card.value.equals("J") || card.value.equals("Q")) {
            return 10;
        } else if (card.value.equals("A")) {
            return 11;
        } else {
            Integer x = Integer.parseInt(card.value) + 2;
            return (x);

        }

    }
}


