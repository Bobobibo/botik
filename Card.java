import java.util.Random;


public class Card {
         String symbol;
         String value;
         //private static final String[] values;
        // private static final String[] symbols;
       //  static{
             String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
             String[] symbols = {"♥", "♦", "♣", "♠"};

        // }
             Random rand = new Random();

             private class card{
                 String value;
                 String symbol;


    }
         public card getCards() {

             card card = new card();
             int card1 = rand.nextInt(14);
             int mast = rand.nextInt(4);
             card.value = values[card1 - 1];
             card.symbol = symbols[mast - 1];
            // System.out.println(this.value+this.symbol);

             return card;

         }

         private Integer getValue(card card){
                 if (card.value== "K" || card.value=="J"  ||card.value== "Q"){
                        return 10;
                 }else if (card.value=="A"){
                     return 11;
                 }
                 int value = card.value
                 return card.value

         }
}
