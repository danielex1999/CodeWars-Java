# Age Range Compatibility Equation

Everybody knows the classic "half your age plus seven" dating rule that a lot of people follow (including myself). It's
the 'recommended' age range in which to date someone.

<img src="https://user-images.githubusercontent.com/69739890/118407770-c771f680-b647-11eb-8202-202aeb02c545.png"/>

```minimum age <= your age <= maximum age``` #Task

Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.

This equation doesn't work when the age <= 14, so use this equation instead:

```java
min = age - 0.10 * age
max = age + 0.10 * age
```

You should floor all your answers so that an integer is given instead of a float (which doesn't represent age). Return
your answer in the form [min]-[max]

##Examples:

```java
age = 27   =>   20-40
age = 5    =>   4-5
age = 17   =>   15-20
```