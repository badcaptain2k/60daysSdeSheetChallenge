import java.util.Arrays;

public class mergeSortedArrays {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 0, 0, 0};
        int b[] = {4, 5, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("--------------");
        int res[] = merge(a, 3, b, 3);
        System.out.println(res);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m + n - 1; i > m - 1; i--) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
