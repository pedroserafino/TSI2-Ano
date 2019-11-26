
/**
 * Classe abstrata Mamifero - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Mamifero extends Animal
{
    public Mamifero(){

    }
    public void crescer(double peso,double comprimento){
        peso=peso*0.02;
        comprimento=comprimento*0.2;
        System.out.println("Peso: "+getPeso());
    }
}
