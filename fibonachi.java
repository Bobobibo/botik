import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        Integer n = scanner.nextInt();
        //n = int;
        int x1 = 1;
        int x2 = 1;
        //int n = 14;
        int sum;
        for (int i = 0; i < n; i++) {
            System.out.println(x1);
            System.out.println(x2);
            sum = x1+x2;
            x1=sum;
            sum = x1+x2;
            x2=sum;


        }
    }
}
