
/**
 * Escreva a descrição da classe Animal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Animal implements EmitirSom
{

   protected String nome;
   private double peso;
   private double comprimento;
   private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Animal(){}

    public Animal(String nome, double peso, double comprimento, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.comprimento = comprimento;
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println("Som de animal")
    }
    public void  crescer(double peso,double comprimento){
        this.peso=peso*0.01;
        this.comprimento=comprimento*0.01;

    }
}
