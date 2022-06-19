/*
        Time Complexity: O(N ^ 2)
        Space Complexity: O(1)

        Where N is the size of the array.
*/

import java.util.ArrayList;

public class reversePairs
{
    public static int reversePair(ArrayList<Integer> arr)
    {
        int n = arr.size();

        int ans = 0;

        // Iterate i from 0 to n
        for (int i = 0; i < n; i++)
        {
            // Iterate j from i + 1 to n
            for (int j = i + 1; j < n; j++)
            {
                if (arr.get(i) > arr.get(j) * 2)
                {
                    ans++;
                }
            }
        }

        return ans;
    }
}

