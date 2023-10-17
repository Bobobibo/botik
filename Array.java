public class Array {
    public static void main(String[] args) {
        int[] arr = {40, 50, 90, 70, 20, 25, 23, 11};
        int k = arr.length;

        boolean swap;
        int j = k/2;
        int[] left = {};
        int[] right = {};

        for (int i =0; i<j; i++){
            left[i]=arr[i];
        }
        for (int x =j+1; x<k; x++){
            right[x]=arr[x];
//a++ + ++a
        }
}
