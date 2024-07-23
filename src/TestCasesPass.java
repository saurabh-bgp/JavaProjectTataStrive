public class TestCasesPass {
    static boolean GreaterZero(int num){
        if (num>0) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] input = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        boolean[] output ={false,false,false,false,false,false,false,false,false,false,false,true,true,true,true,true,true,true,true,true,true,false};
        boolean bl =false;
        for (int i = 0; i < input.length; i++) {
            if (GreaterZero(input[i])==output[i]){
                bl=true;
            }else {
                bl = false;
                break;
            }

        }
        if (bl){
            System.out.println("Wrong Input");
        }
        else {
            System.out.println("Success full");
        }
    }
}
