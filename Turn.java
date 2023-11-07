import java.io.*;

public class Turn {

    static Card playercard = new Card();
    static Card dilercard = new Card();

    static Integer getCard() {
        String y = playercard.getCards();
        Integer x = playercard.getValue(); // get value in int

        System.out.println(y);
        System.out.println(x);


        return x;

    }
    static Integer dilerTurn(){
        String y1 = dilercard.getCards();
        Integer x1 = dilercard.getValue(); // get value in int

        System.out.println(y1);
        System.out.println(x1);
        return x1;

    }

}
