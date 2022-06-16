- This solution is little bit similar to two sum problem.
-Loop from i = 0 to arr.length, maintaining in a Set the array elements from [0, i - 1].
-On each step of the loop check if we have seen the element 2 * arr[i] so far or arr[i] / 2 was seen if arr[i] % 2 == 0.
- We are checking a %2 == 0 to check if the number is even or not. Otherwise for odd numbers the logic will fail.
Ex: ( 3/2 = 1 ) , but ( 1 * 2 != 3 )
- For odd number if we divide by 2 then it will not be perfectly divisible, that's why we are checking if a % 2 == 0 or not.