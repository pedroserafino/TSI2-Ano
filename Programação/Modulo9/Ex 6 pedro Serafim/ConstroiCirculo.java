public class ConstroiCirculo{
    public static void main(String [] args){
        Circulo c1=new Circulo(1.0,1.0,5.0);
        Circulo c2=new Circulo(5.0,2.0,3.0);
        
        System.out.println("Area de c1: "+c1.area());
        System.out.println("Area de c2: "+c2.area());
        System.out.println("Perimetro de c1: "+c1.peri());
        System.out.println("Perimetro de c2: "+c2.peri());
        c1.aumentarraio(2.0);
        c2.diminuirraio(1.5);
        System.out.println("Area de c1: "+c1.area());
        System.out.println("Area de c2: "+c2.area());
        System.out.println("Perimetro de c1: "+c1.peri());
        System.out.println("Perimetro de c2: "+c2.peri());
        System.out.println("O raio de c1 é maior do que o raio de c2 "+c1.raioMaior(c2));
    }
}