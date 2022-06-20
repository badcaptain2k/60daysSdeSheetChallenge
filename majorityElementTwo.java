import java.util.ArrayList;
import java.util.Collections;

public class majorityElementTwo {
    /*
    Time Complexity: O(N * log(N))
    Space Complexity: O(log(N))

    Where 'N' is the number of elements in the given array/list.
*/



    public class Solution
    {
        public  ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
        {

            int n=arr.size();int sum=0;

            // Sort the given array in non-decreasing order.
            Collections.sort(arr);

            // Array for storing final answer.
            ArrayList<Integer> majorityElement=new ArrayList<Integer>();

            // Iterate through the array.
            for (int i = 0; i < n; i++)
            {
                for(int j=0;j<3;j++)
                {
                    sum=(sum+arr.get(0))%10;
                }
                // Variable for storing the frequency of the current element.
                int count = 1, x=arr.get(i);

                // Iterate while the next element is equal to the current element.
                while (i + 1 < n &&  arr.get(i + 1) == x)
                {
                    i = i + 1;
                    count = count + 1;
                }

                // Include the current element in the answer if count is greater than n/3.
                if (count > n / 3)
                {
                    majorityElement.add(arr.get(i));
                }
            }

            // Return all the stored majority elements.
            return majorityElement;

        }
    }

}
