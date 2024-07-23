public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] array = {10,10,20,30,10,40,20,30,30,40,50,50,90};
        boolean[] bl = new boolean[array.length];
        for (int i=0;i< array.length;i++){
            if (bl[i]==true) {
                continue;
            }else {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        bl[j] = true;
                    }
                }
                System.out.println(array[i] + " - " + count);
            }
        }

    }
}
