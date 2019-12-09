public class ConstroiQuadrado{
  public static void main(String [] args){
      Quadrado q1= new Quadrado(2,4);

      System.out.println("Lado de q1: "+q1.getx2()-q1.getx1());
      System.out.println("Perimetro de q1: "+q1.QPerimetro());
      System.out.println("Area de q1: "+q1.QArea());


  }
}
