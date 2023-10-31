import java.util.* ;


 public class Player {

     static Card playercard= new Card();
    static String getName (){
        Scanner namescanner = new Scanner(System.in);
        System.out.println("Say your name: ");
        String name = namescanner.next();

        return name;
    }

    int defaultbalance = 500;

    Card[] card() {
        return new Card[0];
    }

   

     public static void main(String[] args) {
        // String y = playercard.getCards();

       // Integer x = playercard.getValue(); // get value in int

       //  System.out.println(y);
      //   System.out.println(x);
          getName();

     }
  }

