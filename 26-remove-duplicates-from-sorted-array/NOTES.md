```
Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast-runner. As long as nums[i] = nums[j], we increment j to skip the duplicate.
​
When we encounter nums[j] != nums[i], the duplicate run has ended so we must copy its value to nums[i + 1]. i is then incremented and we repeat the same process again until j reaches the end of array.
```
​
# Note:
If the question asks for in-place solution then, always think of 2 pointer approach.