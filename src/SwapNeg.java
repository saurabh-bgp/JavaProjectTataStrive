public class SwapNeg {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, 10, 20};
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            if (arr[s] < 0) {
                s++;
            } else if (arr[e] >= 0) {
                e--;
            } else {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
