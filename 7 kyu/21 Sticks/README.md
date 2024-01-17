# 21 Sticks

**The game**
In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks. The last person to take
a stick wins. For example:

```
21 sticks in the pile

Bob takes 2  -->  19 sticks left
Jim takes 3  -->  16 sticks
Bob takes 3  -->  13 sticks
Jim takes 1  -->  12 sticks
Bob takes 2  -->  10 sticks
Jim takes 2  -->   8 sticks
Bob takes 3  -->   5 sticks
Jim takes 3  -->   2 sticks
Bob takes 2  -->  Bob wins!
```

**Your task**
Create a robot that will always win the game. Your robot will always go first. The function should take an integer and
returns ```1```, ```2```, or ```3```.

**Note:** The input will always be valid (a positive integer)
