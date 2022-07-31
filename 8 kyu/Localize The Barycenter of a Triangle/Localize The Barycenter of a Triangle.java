import org.apache.commons.math3.util.Precision;  
class Barycenter {
    
    public static double[] barTriang(double[] x, double[] y, double[] z){
        double result[]= new double[2];
      
        result[0]=Precision.round((x[0]+y[0]+z[0])/3,4);
        result[1]=Precision.round((x[1]+y[1]+z[1])/3,4);
      
        return result;
    }
}
