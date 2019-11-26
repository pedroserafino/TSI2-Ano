import java.lang.Math;
public class Circulo{
    private double x,y;
    private double raio;
    
    public double getx(){
        return x;
    }
        public void setx(double x){
        this.x=x;
    }
        public double gety(){
        return y;
    }
        public void sety(double y){
        this.y=y;
    }
    public Circulo(double x,double y,double raio)
    {
        this.x=x;
        this.y=y;
        this.raio=raio;
    }
    public double getraio(){
        return raio;
    }
    public double area(){
        return Math.PI*(raio*raio);
    }
    public double peri(){
        return Math.PI*2*raio;
    }
    public void aumentarraio(double aumentar){
        this.raio=this.raio+aumentar;
    }
    public void diminuirraio(double retirar){
        this.raio=this.raio-retirar;
    }
    public boolean raioMaior(Circulo c){
        if(this.raio>c.getraio())
            return true;
        else
            return false;
    }
    }
