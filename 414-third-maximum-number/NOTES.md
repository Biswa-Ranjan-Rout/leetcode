Solution 1:
​
```
​
class Solution {
​
public int thirdMax(int[] nums) {
Set<Integer> set = new HashSet<>();
for (int num : nums) {
set.add(num);
}
int max = Collections.max(set);
if (set.size() < 3) { //If there are less than 3 numbers then return the maximum
return max;
} else {
set.remove(max);// removed the 1st max value
max = Collections.max(set);
set.remove(max); // removed the 2nd max value
​
max = Collections.max(set);
}
return max;
}
}
​
```
Complexity Analysis
​
Time Complexity : O(n).
​
Putting the input Array values into a HashSet has a cost of O(n), as each value costs O(1) to place, and there are nn of them.
​
Finding the maximum in a HashSet has a cost of O(n), as all the values need to be looped through. We do this 3 times, giving O(3⋅n)=O(n) as we drop constants in big-oh notation.
​
Deleting a value from a HashSet has a cost of O(1), so we can ignore this.
​
In total, we're left with O(n) + O(n) = O(n).
​
Space Complexity : O(n).
​
In the worst case, the HashSet is the same size as the input Array, and so requires O(n) space to store.
​