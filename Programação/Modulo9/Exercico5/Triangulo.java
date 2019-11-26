import java.lang.Math;

public class Triangulo{
    private double x1,x2,x3,y1,y2,y3;
    public Triangulo(){
    }
    
    public double TriangArea(){
        return (x2-x1)*(y3-y2)/2;
    }
 
    public double TriangPeri(){
        return Math.sqrt((x2-x1)+(y3-y1));
    }
    
    
}


