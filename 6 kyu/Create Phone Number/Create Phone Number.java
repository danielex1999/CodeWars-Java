public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    int index = 0;
    String phoneNum = "(";
    while (index < 3) {
      if (index == 2) {
        phoneNum = phoneNum + String.valueOf(numbers[index]) + ") ";
        index++;
      }
      else {
        phoneNum = phoneNum + String.valueOf(numbers[index]);
        index++;
      }
    }
    while (index > 2 && index < numbers.length) {
      if (index == 5) {
        phoneNum = phoneNum + String.valueOf(numbers[index]) + "-";
        index++;
      }
      else {
        phoneNum = phoneNum + String.valueOf(numbers[index]);
        index++;
      }
    }
    return phoneNum;
  }
}
