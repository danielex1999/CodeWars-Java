# Remove Duplicates

You are to write a function called `unique` that takes an array of integers and returns the array with duplicates
removed. It must return the values in the same order as first seen in the given array. Thus no sorting should be done,
if 52 appears before 10 in the given array then it should also be that 52 appears before 10 in the returned array.

<b>Assumptions</b>

- All values given are integers (they can be positive or negative).
- You are given an array but it may be empty.
- They array may have duplicates or it may not.

<b>Example</b>

```
UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10]) 
// -> [1, 5, 2, 0, -3, 10]
```
