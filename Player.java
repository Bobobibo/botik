import java.util.* ;


 public class Player {

     static Card playercard= new Card();
    static String getName (){
        Scanner namescanner = new Scanner(System.in);
        System.out.println("Say your name: ");
        String name = namescanner.next();

        return null;
    }

    int defaultbalance = 500;

    Card[] card() {
        return new Card[0];
    }

   

     public static void main(String[] args) {
         Card.card y = playercard.getCards();
        //String z = y.toString();
        Integer x = playercard.getValue(y); // get value in int

        // System.out.println(z);
         System.out.println(x);
          getName();

     }
  }

