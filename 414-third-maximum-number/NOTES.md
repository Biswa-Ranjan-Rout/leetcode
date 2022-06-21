This will also handle duplicates elegantly—if for example we had the input set [12, 12, 4, 2, 12, 1], then the first value we'd put into the seen maximums Set would be 12. Then when we find the second maximum, the algorithm knows to ignore all the 12s.
​
```
​
class Solution {
​
public int thirdMax(int[] nums) {
​
Set<Integer> seenMaximums = new HashSet<>();
for (int i = 0; i < 3; i++) {
Integer curMaximum = maxIgnoringSeenMaximums(nums, seenMaximums);
if (curMaximum == null) {
return Collections.max(seenMaximums);
}
seenMaximums.add(curMaximum);
}
​
return Collections.min(seenMaximums);
}
​
​
private Integer maxIgnoringSeenMaximums(int[] nums, Set<Integer> seenMaximums) {
Integer maximum = null;
for (int num : nums) {
if (seenMaximums.contains(num)) {
continue;
}
if (maximum == null || num > maximum) {
maximum = num;
}
}
return maximum;
}
}
​
```
Time Complexity : O(n).
For each of the three times we find the next maximum, we need to perform an O(n) scan. Because there are only, at most, three scans the total time complexity is just O(n).
​
The Set operations are all O(1) because there are only at most 3 items in the Set.
​
Space Complexity : O(1).
​
Because seenMaximums can contain at most 3 items, the space complexity is only O(1).
​
Approach 3: Keep Track of 3 Maximums Using a Set
Intuition