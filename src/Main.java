import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Main.rotate(arr, 3);

//        System.out.println(arr.length);
    }

    public static void rotate(int[] nums, int k) {

        int[] cache = nums.clone();
        for (int i = k; i >0; i--){
            for (int j = 1; j <= nums.length - 2; j++){

                if(j == nums.length - 1){
                    nums[j] = cache[j-1];

                } else{
                    nums[0] = cache[j];
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}