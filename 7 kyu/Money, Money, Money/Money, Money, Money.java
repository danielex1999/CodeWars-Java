public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int total=0;
        while(principal < desired){
            principal= principal +((principal*interest)*(1-tax));
            total++;
        }
        return total;
    }
}
