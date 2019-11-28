
/**
 * @author (Pedro Serafim)
 */
import java.util.Scanner;
public class JardimZoologico
{
    Animal[] jaula = new Animal[4];
    Animal[] gaiola= new Animal[3];
    Animal[] aquario= new Annimal[3];

    Scanner s= new Scanner(System.in);
    ConstrutorGenerico construtorGenerico = new ConstrutorGenerico();

    for(int i=0;i<4;i++){
        System.out.println("Insira o tipo de animal: ");
        String tipoAnimal =s.nextLine():
    jaula[i] = construtorGenerico.criarAnimal(tipoAnimal);
    }

    for (int i;i<4;i++){
        jaula[i].emitirSom();
        if(jaula[i] instanceof Cao)
            ((Cao)jaula[i]).correr();
        else if(jaula[i] instanceof Cavalo)
            ((cavalo)jaula[i]).correr();
        else if(jaula[i] instanceof Mcacao)
            ((Macaco)jaula[i]).subirArvores();
        else if(jaula[i] instanceof Ovelha )
            ((Ovelha)jaula[i]).pastar();
    }

    for(int 0;i<3;i++)
    {
        System.out.println("Insira o tipo de animal: ");
        String tipoAnimal =s.nextLine();
        gaiola[i] = construtorGenerico.criarAnimal(tipoAnimal);
    }
    for(int i=0;i<3;i++){
        gaiola[i].emitirSom();
        if(gaiola[i] instanceof Canario)
            ((Canario)gaiola[i]).voar();
        else if(gaiola[i] instanceof Pato)
            ((Pato)gaiola[i]).voar();
        else if(gaiola[i] instanceof Papagaio)
            ((Papagaio)gaiola[i]).voar();
    }

     for(int 0;i<3;i++)
    {
        System.out.println("Insira o tipo de animal: ");
        String tipoAnimal =s.nextLine();
        aquario[i] = construtorGenerico.criarAnimal(tipoAnimal);
    }

    for(int i=0;i<3;i++){
    aquario[i].emitirSom();
    if(aquario[i] instanceof Canario)
        ((Salmao)aquario[i]).voar();
    else if(aquario[i] instanceof Pato)
        ((Atum)aquario[i]).voar();
    else if(aquario[i] instanceof Papagaio)
        ((Bacalhau)aquario[i]).voar();
    }


}
