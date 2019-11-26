public class CarroCorrida{
    protected Piloto piloto;
    protected int velocidadeatual=0;
    protected int velocidademaxima=360;
    private int i=0;
    protected String numeroIdentificacao;
    protected Motor motor;
    
    public CarroCorrida(){
    }
    public String getnumeroIdentificacao(){
        return numeroIdentificacao;
    }
    public void setIdentificacao(){
        this.numeroIdentificacao= numeroIdentificacao;
    }
    public Piloto getPiloto(){
        return piloto;
    }
    public void seCondutor(Piloto piloto){
        this.piloto= piloto;
    }
    public int getVelocidadeatual(){
        return velocidadeatual;
    }
    public int getVelocidadeMaxima(){
        return velocidademaxima;
    }
    public void setVelocidadeMaxima(){
        this.velocidademaxima=velocidademaxima;
    }
     void ligar(){
        System.out.println("VRUUUUUUUUUMMMMMMMM");
        i=i+1;
    }
    void desligar(){
        System.out.println("MMMMMMMMMMMMM");
        i=0;
    }
    void acelerar(){
        if(i==1){
            velocidadeatual+=10+piloto.destreza*0.1+motor.potencia*0.1;
            if(velocidadeatual>velocidademaxima)
                velocidadeatual=velocidademaxima;
        }
        else
            System.out.println("O Carro Nao foi Ligado");
    }
    void travar (int intensidadetravagem){
        if(i==1){
        if(intensidadetravagem>velocidademaxima)
            intensidadetravagem = velocidademaxima;
        else
        if(intensidadetravagem<0)
            intensidadetravagem=0;
        velocidadeatual =intensidadetravagem;
        if(velocidadeatual>velocidademaxima)
            velocidadeatual=velocidademaxima;
        else if(velocidadeatual<0)
        velocidadeatual=0;
        }
        else
            System.out.println("O Carro Nao foi Ligado");
    }
}
    