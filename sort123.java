import java.util.Arrays;

public class sort123 {

    public static void main(String[] args) {
        int arr[]= {1,0,1,2,2,2,0,0,1,0,2};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] nums){
        int len = nums.length;
        int low = 0, mid = 0, high = len - 1;
        while(mid <= high){
            switch(nums[mid]){

                case 0 :{
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }

            }
        }
    }

}
