# Enumerable Magic #1 - True for All?

<b>Task</b>

Create a method <b>all</b> which takes to params:

- a sequence
- a function (function pointer in C)

and returns <b>true</b> if the function in the params returns true for every element in the sequence. Otherwise, it should return false. If the sequence is empty, it should return true, since technically nothing failed the test.

<b>Example</b>

```
all((1, 2, 3, 4, 5), greater_than_9) -> false
all((1, 2, 3, 4, 5), less_than_9)    -> True
```
<b>Help</b>

Here's a (Ruby) resource if you get stuck:

http://www.rubycuts.com/enum-all
