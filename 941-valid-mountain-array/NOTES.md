If we walk along the mountain from left to right, we have to move strictly up, then strictly down.
​
Algorithm
​
Let's walk up from left to right until we can't: that has to be the peak. We should ensure the peak is not the first or last element. Then, we walk down. If we reach the end, the array is valid, otherwise its not.