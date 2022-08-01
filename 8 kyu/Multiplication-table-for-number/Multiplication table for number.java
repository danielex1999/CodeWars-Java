class Kata {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
      
        for (int i = 1; i <= 10; i++) {
            sb.append(i + " * " + num + " = " + i * num);
          
            if (i < 10) {
              sb.append("\n");
            }
        }
      
        return sb.toString();
    }
}
