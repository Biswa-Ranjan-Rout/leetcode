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
​
So far, our approaches have required multiple parses through the input array. While this is still O(n) in big-oh notation, it'd be good if we could solve it in a single parse. One way is to simply use a Set to keep track of the 3 maximum values we've seen so far. While you could achieve something similar using 3 variables (maximum, secondMaximum, and thirdMaximum), this is messy to work with and is poor programming practice.
​
For each number in the Array, we add it into the Set of maximums. If this causes there to be more than 3 numbers in the Set, then we evict the smallest number.
​
At the end, we check whether or not there are 3 numbers in the Set. If there are, this means the third maximum exists, and will be the minimum in the Set. If not, this means there was no third maximum, and so we should return the maximum of the Set, as per the problem requirements.
Complexity Analysis
​
Time Complexity : O(n).
​
For each of the nn values in the input Array, we insert it into a Set for a cost of O(1). We then sometimes find and remove the minimum of the Set. Because there are never more than 33 items in the Set, the time complexity of doing this is O(1).
​
In total, we're left with O(n).
​
Space Complexity : O(1).
​
Because maximums never holds more than 33 items at a time, it is considered to be constant O(1).
​