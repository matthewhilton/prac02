package shapes;
import java.lang.Math;

public class Tetrahedron implements Shape {
    private double edge;

    public Tetrahedron(double e){
        this.edge = e;
    }

    @Override
    public double volume() {
        return(Math.pow(edge, 3) / (6 * Math.sqrt(2)));
    }

    @Override
    public double surfaceArea() {
        return(Math.sqrt(3) * Math.pow(edge, 2));
    }
}