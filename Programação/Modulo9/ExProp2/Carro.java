
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    Motor m=new Motor();
    private String cor;
    private int numerodeportas=4;
    private int maximodepessoas=5;
    private int anofabricacao;
    private int anodemodelo;
    private String marca;
    private String modelo;
    private int pesodocarro=1;
    private int pessoasnocarro=3;
    private float km= 120;
    private float consumo=1;
    private float litrosnotanque=20;
    private boolean ligado=false;
    private double velocidadeatual=100.0;
    private int velocidademaxima=220;
   public double getvelocidadeatual(){
       return velocidadeatual;
    }
   public void setvelocidadeatual(double x)
   {
       this.velocidadeatual=x;
   }
   public boolean getligado(){
      return ligado;
   }
   public void setligado(boolean lig){
       this.ligado=lig;
   }
   public String getcor(){
      return cor;
   }
   public void setcor(String cor){
       this.cor=cor;
   }
   
   public int getnumerodeportas(){
       return numerodeportas;
   }
   public void setnumerodeportas(int n){
       this.numerodeportas=n;
   }
   
   public int getmaximodepessoas(){
      return maximodepessoas;
    }
   public void setmaximodepessoas(int m){
       this.maximodepessoas=m;
    }
    
   public int getanofabricacao(){
        return anofabricacao;
   }
   public void setanofabricacao(int a){
       this.anofabricacao=a;
   }
   public int getanodemodelo(){
       return anodemodelo;
   }
   public void setanodemodelo(int a){
       this.anodemodelo=a;
   }
   public String getmarca(){
       return marca;
    }
   public void setmarca(String marca){
       this.marca=marca;
    }
   public String getmodelo(){
       return modelo;
   }
   public void setmodelo(String modelo){
       this.modelo=modelo;
   }
   public int getpesodocarro(){
       return pesodocarro;
   }
   public void setpesodocarro(int p){
       this.pesodocarro=p;
   }
   public int getpessoasnocarro(){
       return pessoasnocarro;
   }
   public void setpessoasnocarro(int p){
       this.pessoasnocarro=p;
   }
   public float getkm(){
       return km;
    }
   public void setkm(float km){
       this.km=km;
   }
   public float getconsumo(){
       return consumo;
    }
   public void setconsumo(float c){
       this.consumo=c;
    }
   public float getlitrosnotanque(){
       return litrosnotanque;
   }
   public void setlitrosnotanque(float l){
       this.litrosnotanque=l;
    }
   public Carro(){
   }
   public void RegCarro(String cor,int numerodeportas,int anofabricacao,int anodemodelo,String marca,String modelo){
       this.cor=cor;
       this.numerodeportas=numerodeportas;
       this.anofabricacao=anofabricacao;
       this.anodemodelo=anodemodelo;
       this.marca=marca;
       this.modelo=modelo;
    }
   public void RegPessoas(int pessoasnocarro,int pesodocarro){
       this.pessoasnocarro=pessoasnocarro;
       this.pesodocarro=pesodocarro;
    }
   public void DespCarro(float km,float consumo,float litrosnotanque){
       this.km=km;
       this.consumo=consumo;
       this.litrosnotanque=litrosnotanque;
    }
   void ligar()
   {
       if(pessoasnocarro>0||litrosnotanque>0)
            this.ligado=true;
       else
       System.out.println("Nao foi possivel ligar o carro certefique-se que existem pessoas no carro ou que existe combustivel no tanque");
   }
   void acelarar(){
        if(!ligado){
        velocidadeatual=velocidadeatual+(m.getpotencia()*0.05);
        if(velocidadeatual >velocidademaxima)
            velocidadeatual=velocidademaxima;
        }
        else
            System.out.println("Carro nao esta ligado");
    }
    void travar (int intensidadetravagem){
        if(!ligado){
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
    }
    void PessoasDentro(int pessaosnocarro)
    {
        this.pessoasnocarro=pessoasnocarro;
    }
    void Velocidade(double velocidadeatual){
        this.velocidadeatual=velocidadeatual;
    }
    
}
