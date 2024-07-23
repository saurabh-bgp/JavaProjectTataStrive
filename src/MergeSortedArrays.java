import java.util.Arrays;

public class MergeSortedArrays {
 static int[] resultArray(int []nums1, int[] nums2){
     int size1 = 0;
     for (int i = 0; i < nums1.length; i++) {
         if (nums1[i] != 0) {
             size1++;
         } else {
             break;
         }
     }

     int size2 = 0;
     for (int i = 0; i < nums2.length; i++) {
         if (nums2[i] != 0) {
             size2++;
         } else {
             break;
         }
     }

     int totalSize = size1 + size2;

     int[] retArr = new int[totalSize];

     int j = 0;
     for (int i = 0; i < size1; i++) {
         retArr[j] = nums1[i];
         j++;
     }

     for (int i = 0; i < size2; i++) {
         retArr[j] = nums2[i];
         j++;
     }
     Arrays.sort(retArr);
    return retArr;
 }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
       for (int val : resultArray(nums1,nums2)) {
        System.out.print(val+ " ");
       }
    }
}
