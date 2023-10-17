import java.util.Scanner ;

public class numberfibonacciwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        Integer n = scanner.nextInt();
        System.out.println(n);
        int i = 0;
        int x1 = 1;
        int x2 = 1;
        System.out.println(x1);
        System.out.println(x2);
        while(i!=n) {
            int tmp = x2;
            x2 += x1;
            x1 = tmp;
            System.out.println(x2);
            i++;

        }
        }
    }

