
/**
 * Classe abstrata Peixe - escreva a descrição da classe aqui
 *
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Peixe extends Animal
{
    public Peixe(){

    }

    public abstract void nadar() {
        System.out.println("O peixe nada");
    }

    public void porOvos() {
        System.out.println("O peixe poe ovos");
    }
}
