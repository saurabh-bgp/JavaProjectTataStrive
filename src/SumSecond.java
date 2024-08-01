import java.util.Arrays;

public class SumSecond {
    public static void main(String[] args) {
        int[] A = {1, 5, -1, 2, 10, -3};
        int[] Q = {1, 3, 2, 4,0,5};
        for (int i = 0; i < Q.length; i++) {
            int ind = Q[i];
            int siz = A.length - ind;
            int[] arr = new int[siz];
            int k = 0;
            int sum =0;
            for (int j = ind; j < A.length; j++) {
                sum+=A[j];
                arr[k] = sum;
                k++;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
