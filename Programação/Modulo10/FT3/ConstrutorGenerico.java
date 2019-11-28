
public class ConstrutorGenerico
{
    public Animal criarAnimal(String tipoAnimal){
        if(tipoAnimal.equals("cao"))
            return new Cao();
        else if(tipoAnimal.equals("macaco"))
            return new Macaco();
        else if(tipoAnimal.equals("pato"))
            return new Pato();
        else if(tipoAnimal.equals("cavalo"))
            return new Cavalo();
        else
            return new Animal();
    }
}
