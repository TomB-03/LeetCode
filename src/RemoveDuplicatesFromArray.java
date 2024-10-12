import java.util.*;

public class RemoveDuplicatesFromArray {

    public int[] removeDuplicatesWithSet(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
    }
        Integer[] arr = set.toArray(new Integer[0]);
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] =  arr[i];
        }

        return result;
    }
}
