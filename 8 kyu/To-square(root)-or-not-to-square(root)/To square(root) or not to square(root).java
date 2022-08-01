public class Kata{
  public static int[] squareOrSquareRoot(int[] array){
    for (int i = 0; i < array.length; i++) {
    int root = (int)Math.sqrt(array[i]);
    if (root * root == array[i]) {
      array[i] = root;
    } else {
      array[i] *= array[i];
    }
  }
  return array;
}
  }
