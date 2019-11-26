import java.lang.Object;
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Pessoa
{
    private String nome;
    private String morada;
    private int idade;
    private char genero;
    private long contacto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getContacto() {
        return contacto;
    }

    public void setContacto(long contacto) {
        this.contacto = contacto;
    }
    public Pessoa(){}
    public Pessoa(String nome,String morada,int idade,char genero,long contacto)
    {
        this.nome=nome;
        this.morada=morada;
        this.idade=idade;
        this.genero=genero;
        this.contacto=contacto;
    }
    public void falar(){
        System.out.println("Sou uma pessoa");
    }
    public void falar(String frase)
    {
        System.out.println(frase);
    }
    public String toString()
    {
        return "Ola! Eu sou do genero "+genero+" chamo-me "+nome+" tenho "+idade+"vivo em "+morada+" e o meu contacto é "+contacto;
    }
}
