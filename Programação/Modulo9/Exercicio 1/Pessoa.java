
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    //Atributos da classe PEssoa(Estado)
    String nome;
    char genero;
    int idade;

    /**
     * COnstrutor para classe Pessoa default
     */
    public Pessoa(){
    }
        public Pessoa(String n,char g)
    {this.nome=n;
     this.genero=g;
    }
    public Pessoa(String n,char g,int i){
        this(n,g);
        this.idade=i;
    }
    //Métodos (Comportamentos)
    void falar(){
        System.out.println("Blá,Blá...");
    }

}
