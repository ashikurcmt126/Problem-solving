public class Leet_26 {

    private static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (i < nums.length -1 && nums[i]==nums[i+1]){
                continue;
            }
            nums[j] = nums[i];
            j++;
        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
        int newLength = removeDuplicates(nums);

        System.out.println("Length of array after removing duplicates = " + newLength);

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
