import java.util.*;



public class Blackjack {

    static Card playercard = new Card();
    static Card dilercard = new Card();
    static Player playername = new Player();
    static Turn playercardd = new Turn();
    static Turn dilercardd = new Turn();

    static Turn deck= new Turn();
    static Turn playerdeck=new Turn();
    static Boolean situation = false;

    public static void main(String[] args) {

        int dilerhand = 0;
        int playerhand = 0;
        String pname = Player.getName();
        Scanner decide = new Scanner(System.in);
        System.out.println("Your turn?(start or stop): ");
        String decision = decide.next();
        switch (decision) {
            case "start":
                System.out.println(pname + "'s turn: ");
                Integer x1 = Turn.getCard();
                Integer x2 = Turn.getCard();
                playerhand = x1 + x2;
                playerdeck.playerShowdeck();
                System.out.println("Diler's turn: ");
                Integer x11 = Turn.dilerfirstTurn();
                Integer x21 = Turn.dilerTurn();
                dilerhand = x11 + x21;

            case "stop":
                System.out.println("No game");
                situation = true;
                break;

        }
        if(!decision.equals("stop")){
            for (;;) {

                    if (playerhand > 21) {
                        System.out.println("you lost");
                        situation = true;
                        break;

                    }
           // if (situation.equals(true)) {
               // break;

           // }

                    for(;;){

                        System.out.println("Your turn?(take or hold): ");
                        Scanner decide2 = new Scanner(System.in);
                        String decision2 = decide2.next();
                        switch (decision2) {
                            case "take":
                                System.out.println(pname + "'s turn: ");
                                playerhand += Turn.getCard();
                                playerdeck.playerShowdeck();
                                if (playerhand > 21) {
                                    System.out.println("you lost");
                                    situation = true;
                                    break;

                                 }
                            case "hold":
                                for (; ; ) {
                                    if (dilerhand < 17) {
                                        dilerhand += Turn.dilerTurn();
                                    }
                                     if (dilerhand > 21) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("diler lost");
                                        situation = true;
                                        break;
                                    }  if (dilerhand == 21 && playerhand < 21) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("diler won");
                                        situation = true;
                                        break;
                                    } if (dilerhand == 21 && playerhand == 21) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("draw");
                                        situation = true;
                                        break;
                                    } if (dilerhand == 21 && playerhand > 21) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("diler won");
                                        situation = true;
                                        break;
                                    }  if (dilerhand < 21 && dilerhand >= 17 && dilerhand < playerhand) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("diler lost");
                                        situation = true;
                                        break;
                                    } if (dilerhand < 21 && dilerhand >= 17 && dilerhand > playerhand) {
                                        playerdeck.playerShowdeck();
                                        deck.dillerShowdeck();
                                        System.out.println("you lost");
                                        situation = true;
                                        break;
                                    }
                                    if (situation.equals(true)) {
                                        break;
                                    }
                                }
                            if (situation.equals(true)) {
                                    break;
                            }
                        }
                        if (situation.equals(true)) {
                            break;
                        }
                    }
                if (situation.equals(true)) {
                    break;
                }
            }
        }

    }

}