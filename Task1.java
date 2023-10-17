public class Task1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int c = 2;

        float d = (b*b) - (4*a*c);
        if (d>=0) {
            double dd = Math.sqrt(d);
            double x1 = (-b + dd) / (2 * a);
            double x2 = (-b - dd) / (2 * a);
            System.out.println("x1 is " + x1);
            System.out.println("x2 ir " + x2);
        }
        else {
            System.out.println("D is less than 0");

        }
        }
        }
