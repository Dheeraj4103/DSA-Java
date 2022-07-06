

import java.util.Arrays;

public class swaping {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 15;
    }
}
