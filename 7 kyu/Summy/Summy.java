class Summation {

  static long summy(String stringOfInts) {
    long result = 0;
    String[] ints = stringOfInts.split(" ");
    for(int i=0;i<ints.length;i++){
      result=(Integer.parseInt(ints[i]))+result;
    }
    return result;
  }
}
