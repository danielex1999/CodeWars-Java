# Simple Fun #2: Circle of Numbers

<b>Task</b>

Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given `n` and `firstNumber`/`first_number`, find the number which is written in the radially opposite position to firstNumber.

<b>Example</b>

For n = 10 and firstNumber = 2, the output should be
```
CircleOfNumbers.circleOfNumbers(n, firstNumber) == 7
```

![](https://www.pythoninformer.com/img/generative-art/generativepy-art/cardioid-points1.png)

<b>Input/Output</b>

- `[input]` integer `n`

  A positive even integer.

  Constraints: 4 ≤ n ≤ 1000.

- `[input]` integer `firstNumber`/`first_number`

  Constraints: 0 ≤ firstNumber ≤ n - 1

- `[output]` an integer
