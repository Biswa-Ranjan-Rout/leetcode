​
​
​
Note: In the diagram above we just show source and destination array for understanding purpose. We will be doing these operations only on one array.
Handle the edge case for a zero present on the boundary of the leftover elements.
​
Let's talk about the edge case of this problem. We need to be extra careful when we are duplicating the zeros in the leftover array. This care should be taken for the zero which is lying on the boundary. Since, this zero might be counted as with possible duplicates, or may be just got included in the left over when there was no space left to accommodate its duplicate. If it is part of the possible_dups we would want to duplicate it otherwise we don't.
​
An example of the edge case is - [8,4,5,0,0,0,0,7]. In this array there is space to accommodate the duplicates of first and second occurrences of zero. But we don't have enough space for the duplicate of the third occurrence of zero. Hence when we are copying we need to make sure for the third occurrence we don't copy twice. Result = [8,4,5,0,0,0,0,0]
​
Iterate the array from the end and copy a non-zero element once and zero element twice. When we say we discard the extraneous elements, it simply means we start from the left of the extraneous elements and start overwriting them with new values, eventually right shifting the left over elements and creating space for all the duplicated elements in the array.
​
​
​
​
Complexity Analysis
​
Time Complexity: O(N)O(N), where NN is the number of elements in the array. We do two passes through the array, one to find the number of possible_dups and the other to copy the elements. In the worst case we might be iterating the entire array, when there are less or no zeros in the array.
​
Space Complexity: O(1)O(1). We do not use any extra space.
​
​
```