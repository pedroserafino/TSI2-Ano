

public class Motor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double potencia;
    public double getpotencia(){
        return potencia;
    }
    public void setpotencia(double potencia){
        this.potencia=potencia;
    }
    public Motor()
    {  
    }
    void Potencia(double potencia){
        if(potencia>220)
            potencia=220;
        else if(potencia<90)
            potencia=90;
    }
    
}
