public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
 if (humanYears==1) {
      return new int[]{1,15,15};
    } else if (humanYears==2) {
      return new int[]{2,24,24};
    } 
      return new int[]{humanYears,24+(humanYears-2)*4,24+(humanYears-2)*5};
  }

}
