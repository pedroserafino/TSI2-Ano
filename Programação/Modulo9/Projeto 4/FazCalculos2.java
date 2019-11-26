import java.util.Scanner;
public class FazCalculos2{
    private double x;
    private double y;
    public static void main(String[] args){
        Calculadora calc= new Calculadora();
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza o primeiro numero: ");
        double x= s.nextDouble();
        System.out.println("Introduza o segundo numero: ");
        double y= s.nextDouble();
        
        System.out.println("Soma = "+calc.Somar(x,y));
        System.out.println("Subtrair = "+calc.Subtrair(x,y));
        System.out.println("Dividir = "+calc.Dividir(x,y));
        System.out.println("Multiplicação = "+calc.Multiplicar(x,y));
        
    }
}