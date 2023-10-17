public class arraysort {
    public static void main(String[] args) {
        int[] arr = {10423, 2, 230, -40, 504 , 60, 123, 10 , 76, -7 , 124};
        int i = arr.length;
        int x;
        boolean swap;
        int j = 0;
        int y = 0;
        while (0!=1) {
            swap = false;
            for (x = 0; x < j - y - 1; x++) {
                if (arr[j] < arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    swap = true;

                }
                j++;
            }
            if (swap==false) {
                break;
            }
            y++;
        }
        int n;
        for (n = 0; n < i; n++) {
            System.out.print(arr[n] + " ");
            System.out.println();
        }
        }
    }

