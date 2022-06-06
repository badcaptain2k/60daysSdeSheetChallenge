public class maxSumSubarray {

    public static void main(String[] args) {
        int arr[]={1,2,-5,7,0,15,-20,3};
        long res = maxSubarraySum(arr);
        System.out.println(res);
    }
    public static long maxSubarraySum(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for(int i =0; i<nums.length; i++){

            sum+=nums[i];

            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }

        return max;
    }

}
