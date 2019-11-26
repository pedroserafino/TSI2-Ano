public class Retangulo{
    private double x1,x2,y1,y2;
    public double getx1(){
        return x1;
   }
   public void setx1(double x1){
       this.x1=x1;
    }
        public double getx2(){
        return x2;
   }
   public void setx2(double x2){
       this.x2=x2;
    }
    
    public double gety1(){
        return y1;
   }
   public void sety1(double y1){
       this.y1=y1;
    }
    
   public double gety2(){
       return y2;
   }
   public void sety2(double y2){
       this.y2=y2;
    }
    
    
   public Retangulo(){
   }
   
   public double Calcbase(){
       return x2-x1;
   }
   public double Calcalt(){
       return y2-y1;
   }
   public double CalcPeri(){
       return ((y2-y1)*2+(x2-x1)*2);
   }
   public double CalcArea(){
       return (y2-y1)*(x2-x1);
   }
}