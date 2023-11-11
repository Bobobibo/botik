import java.util.*;

public class Turn {


    static ArrayList<String> playerdeck = new ArrayList<String>();
    static ArrayList<String> dilerdeck = new ArrayList<String>();
    static Card playercard = new Card();
    static Card dilercard = new Card();



    static Integer getCard() {
        String y = playercard.getCards();
        Integer x = playercard.getValue(); // get value in int
        System.out.println(y);
        System.out.println("Card value: " + x);
        playerdeck.add(y);
        //System.out.println(y);
       // System.out.println(x);
       // System.out.println("Your deck:" + playerdeck);
        return x;

    }
    static Integer dilerfirstTurn(){
        String y1 = dilercard.getCards();
        Integer x1 = dilercard.getValue(); // get value in int

        System.out.println(y1);
        System.out.println("Card value: " + x1);
        dilerdeck.add(y1);
        return x1;

    }

    static Integer dilerTurn(){
        String y1 = dilercard.getCards();
        Integer x1 = dilercard.getValue(); // get value in int
        System.out.println("?");
        System.out.println("Card value: ?");
        dilerdeck.add(y1);

        return (x1);


    }
    String dillerShowdeck(){
    System.out.println("Diller's deck: " + dilerdeck);

        return null;
    }
    String playerShowdeck(){

    System.out.println("Player's deck: " + playerdeck);

            return null;
    }



}
