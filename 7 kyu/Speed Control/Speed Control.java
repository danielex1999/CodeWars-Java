public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
        int result = 0;
        for ( int i=0; i<x.length-1; i++ ) {
            int avrSpeed = (int) ( 3600 * ( x[i+1] - x[i] ) / s );
            result = ( result < avrSpeed ) ? avrSpeed : result;
        }
        
        return result;
    }
}
