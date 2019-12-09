public class Quadrado extends FormaGeometrica{
  private double x1,x2;

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

  public Quadrado(double x1,double x2){
    this.x1=x1;
    this.x2=x2;
  }
  public Quadrado(){

  }
  public QPerimetro(){
    return (this.x2-this.x1)*4;
  }
  public QArea(){
    return (this.x2-this.x1)*(this.x2-this.x1);

  }

}
