import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {

        int nums[] = {1,2,3};
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {

        if(nums==null || nums.length==1)
            return;

        int i = nums.length -2;
        while(i >=0 && nums[i] >= nums[i+1]) i--;

        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){
        while(i<j) swap(arr,i++,j--);
    }
}
