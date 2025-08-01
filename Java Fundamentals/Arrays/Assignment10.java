/* Given an array of type int, print true if every element is 1 or 4.
only14([1, 4, 1, 4]) true only14([1, 4, 2, 4]) false only14([1, 1]) → true
*/

public class Assignment10 {

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(only14(new int[]{1, 4, 1, 4})); // true
        System.out.println(only14(new int[]{1, 4, 2, 4})); // false
        System.out.println(only14(new int[]{1, 1}));       // true
        System.out.println(only14(new int[]{}));           // true (no invalid elements)
    }
}
