# 254 shades of grey

Why would we want to stop to only 50 shades of grey? Let's see to how many we can go.

Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal code (#aaaaaa for example). The array should be sorted in ascending order starting with `'#010101'`, `'#020202'`, etc. (using lower case letters).

Examples:
```
n =  1:    ["#010101"]
n = 10:    ["#010101", "#020202", "#030303", "#040404", "#050505", "#060606", "#070707", "#080808", "#090909", "#0a0a0a"]
```
As a reminder, the grey color is composed by the same number of red, green and blue: #010101, #aeaeae, or #555555.

Black: `#000000` and white: `#ffffff` are not accepted values.

When `n` is negative, just return an empty array. If `n` is higher than 254, just return an array of 254 elements.

Have fun!
