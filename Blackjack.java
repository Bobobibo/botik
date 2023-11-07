import java.util.*;



public class Blackjack {

    static Card playercard = new Card();
    static Card dilercard = new Card();
    static Player playername = new Player();
    static Turn playercardd = new Turn();
    static Turn dilercardd = new Turn();
    static Boolean situation = false;

    public static void main(String[] args) {

        int dilerhand = 0;
        int playerhand = 0;
        String pname = playername.getName();
        Scanner decide = new Scanner(System.in);
        System.out.println("Your turn?: ");
        String decision = decide.next();
        switch (decision) {
            case "start":
                System.out.println(pname + "'s turn: ");
                Integer x1 = playercardd.getCard();
                Integer x2 = playercardd.getCard();
                playerhand = x1 + x2;
                System.out.println("Diler's turn: ");
                Integer x11 = dilercardd.getCard();
                Integer x21 = dilercardd.getCard();
                dilerhand = x11 + x21;
            case "stop":

                break;
        }
        for (; ; ) {
            if (playerhand > 21) {
                System.out.println("you lost");
                situation = true;
                break;

            }
            System.out.println("Your turn?: ");
            Scanner decide2 = new Scanner(System.in);
            String decision2 = decide2.next();
            switch (decision2) {
                case "take":
                    System.out.println(pname + "'s turn: ");
                    //Integer x23 = playercardd.getCard();
                    playerhand += playercardd.getCard();
                    if (playerhand > 21) {
                        System.out.println("you lost");
                        situation = true;
                        break;

                    }


                    System.out.println("Diler's turn: ");
                    //Integer x111 = dilercardd.getCard();
                    dilerhand += dilercardd.getCard();
                    if (dilerhand > 21) {
                        System.out.println("diler lost");
                        situation = true;
                        break;

                    }
                case "hold":
                    if (dilerhand < 17) {
                        // dilercardd.getCard();
                        dilerhand += dilercardd.getCard();
                    }
                    if (dilerhand > 21) {
                        System.out.println("diler lost");
                        situation = true;
                        break;
                    }
                    if (dilerhand == 21 && playerhand < 21) {
                        System.out.println("diler won");
                        situation = true;
                        break;
                    } else if (dilerhand == 21 && playerhand == 21) {
                        System.out.println("draw");
                        situation = true;
                        break;
                    } else if (dilerhand == 21 && playerhand > 21) {
                        System.out.println("diler won");
                        situation = true;
                        break;


                    } else if (dilerhand < 21 && dilerhand >= 17 && dilerhand < playerhand) {
                        System.out.println("diler lost");
                        situation = true;
                        break;

                    } else if (dilerhand < 21 && dilerhand >= 17 && dilerhand > playerhand) {
                        System.out.println("you lost");
                        situation = true;
                        break;
                    }
            }

        if (situation.equals(true)) {
                        break;

          }




        }
    }
}