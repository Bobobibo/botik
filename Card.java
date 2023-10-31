import java.util.* ;
// import java.util.Scanner;


public class Card {
    String symbol;
    String value;
    //private static final String[] values;
    // private static final String[] symbols;
    //  static{
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
    String[] symbols = {"♥ ", "♦ ", "♣ ", "♠ "};

    // }
    Random rand = new Random();

    public static class card {
        static String value;
        String symbol;
        String name;


    }

    public String getCards() {

        card card = new card();
        int card1 = rand.nextInt(13);
        int mast = rand.nextInt(4);
        card.value = values[card1];
        card.symbol = symbols[mast];
        card.name= values[card1]+card.symbol;
        // System.out.println(this.value+this.symbol);

        return card.name;

    }

    public Integer getValue() {
        if (card.value.equals("K") || card.value.equals("J") || card.value.equals("Q")) {
            return 10;
        } else if (card.value.equals("A")) {
            return 11;
        } else {
            Integer x = Integer.parseInt(card.value)  ;
            return (x);

        }

    }
}


