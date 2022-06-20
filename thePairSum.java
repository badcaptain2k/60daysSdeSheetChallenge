import java.util.*;

public class thePairSum {
    public static int[][] pairSum(int arr[], int s) {

        // Used to store result.
        List<int[]> ans = new ArrayList();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            // Store frequency of each unique element.
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store unique elements.
        Integer[] keyArray = map.keySet().toArray(new Integer[map.keySet().size()]);

        Arrays.sort(keyArray);

        for (int key : keyArray) {

            if (key + key == s) {

                int freq = map.get(key);

                // Total number of such pairs will be 'FREQ*(FREQ-1)/2'.
                for (int j = 0; j < freq * (freq - 1) / 2; j++) {

                    ans.add(new int[] { key, key });
                }
            }
        }

        // Maintain two pointers.
        int low = 0;
        int high = keyArray.length - 1;

        while (low < high) {

            int currSum = keyArray[low] + keyArray[high];

            // If the current sum is equal to the target sum.
            if (currSum == s) {

                int freq = map.get(keyArray[low]) * map.get(keyArray[high]);

                // Total number of such pairs will be 'FREQ'.
                for (int j = 0; j < freq; j++) {

                    ans.add(new int[] { keyArray[low], keyArray[high] });
                }

                low++;
                high--;

            }
            else if (currSum < s) {

                low++;
            }
            else {

                high--;
            }

        }

        // Used to store final sorted result.
        int res[][] = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {

            int a = ans.get(i)[0], b = ans.get(i)[1];
            res[i][0] = Math.min(a, b);
            res[i][1] = Math.max(a, b);
        }

        Arrays.sort(res, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {

                if (a[0] == b[0]) {

                    return a[1] - b[1];
                }

                return a[0] - b[0];
            }
        });

        return res;
    }
}
