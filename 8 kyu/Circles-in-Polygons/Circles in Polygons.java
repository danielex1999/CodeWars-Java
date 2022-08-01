public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }
    
    public double circleDiameter(){
        return (sideLength / 2.0) / Math.tan(Math.PI / sides) * 2.0;
    }
    
}
