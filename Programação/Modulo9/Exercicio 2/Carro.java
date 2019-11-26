
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    //Atributos
    
    private String matriculas;
    private int velocidadeatual =0;
    private int velocidademaxima =200;
    private Condutor condutor;

    /**
     * COnstrutor para objetos da classe Carro
     */
    public Carro()
    {

    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    void ligar(){
        System.out.println("VRUUUUUUUUUMMMMMMMM");
    }
    void desligar(){
        System.out.println("MMMMMMMMMMMMM");
    }
    void acelarar(){
        /*pergunta 3*/velocidadeatual+=10+condutor.destreza*0.1;
        if(velocidadeatual >velocidademaxima)
            velocidadeatual=velocidademaxima;
        }
    void travar (int intensidadetravagem){
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
    public String getMatricula(){
        return matriculas;
    }
    public void setMatricula(){
        this.matriculas= matriculas;
    }
    public Condutor getCondutor(){
        return condutor;
    }
    public void seCondutor(Condutor condutor){
        this.condutor= condutor;
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
}
