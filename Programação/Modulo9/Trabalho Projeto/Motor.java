public class Motor{
    protected int potencia;
    public Motor(){
    }
    void Potencia(int potencia){
        if(potencia>100)
            potencia=100;
        else if(potencia<1)
            potencia=1;
        }
    
}
