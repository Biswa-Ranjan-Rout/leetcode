# Explanation:
- Iterate from the back to the start,
- We first initilize mx = -1, where max represent the max on the right.
- Each round, we set arr[i] = max, where max is its mas on the right.
- We are keeping current arr[i] value in temp variable for future reference.
- Also we update max = Math.max(max, temp), where temp has it's original value.
​
​
# Complexity:
Time O(N)
Space O(1)