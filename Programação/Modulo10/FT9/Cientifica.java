import java.lang.Math;
public class Cientifica extends Calculadora{
  public Cientifica(){

  }
  public void Pot(double x,int y){
    for(int i=2;i<=y;i++){
      x=x*x;
    }
    return x;
  }
  public void Raiz(double x){
    return Math.sqrt(x);
  }
}
