public class ConstroiRetangulo{

    
    public static void main(String [] args){
        Retangulo rect = new Retangulo();
        
        rect.setx1(2.0);
        rect.sety1(1.0);
        rect.setx2(4.0);
        rect.sety2(5.0);
        
        System.out.println("Base: "+rect.Calcbase()+"cm");
        System.out.println("Altura: "+rect.Calcalt()+"cm");
        System.out.println("Perímetro: "+rect.CalcPeri()+"cm");
        System.out.println("Area: "+rect.CalcArea()+"cm2");
        
    }
}