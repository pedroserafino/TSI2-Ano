public class FazCalculos1{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma = "+calc.Somar(5.2,2.7));
        System.out.println("Subtrair = "+calc.Subtrair(5.2,2.7));
        System.out.println("Dividir = "+calc.Dividir(5.2,2.7));
        System.out.println("Multiplicação = "+calc.Multiplicar(5.2,2.7));
           
    }
}