import java.util.*;



public class Blackjack {

    static Card playercard= new Card();
    static Card dilercard= new Card();
    static Player playername= new Player();


    public static void main(String[] args) {
        int dilerhand = 0;
        int playerhand= 0;
        String pname = playername.getName();
        for (;;) {
            System.out.println(pname + "'s turn   ");
            String y = playercard.getCards();
            Integer x = playercard.getValue(); // get value in int
            playerhand= playerhand + x;
            System.out.println(y);
            System.out.println(x);
            if (dilerhand <17 && dilerhand <=21 ){
                System.out.println("Diler's turn   ");
                String dy = dilercard.getCards();
                Integer dx = dilercard.getValue(); // get value in int
                dilerhand= dilerhand + dx;
                System.out.println(dy);
                System.out.println(dx);
            }else if (dilerhand >21){
                System.out.println("Diler lost");
                break;
            }



        }




    }
}
