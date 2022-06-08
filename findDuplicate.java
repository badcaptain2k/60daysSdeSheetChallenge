public class findDuplicate {

    public static void main(String[] args) {
        int arr[]={1,4,2,3,4,5};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
