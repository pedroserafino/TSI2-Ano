import java.util.Scanner;
/**
 * Escreva a descrição da classe Condutor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CarroPasseio
{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        Carro c= new Carro();
        Condutor cond=new Condutor();
        Motor m=new Motor();
        
        System.out.println("Cor: ");
        c.setcor(s.nextLine());
        
        
        System.out.println("Marca: ");
        c.setmarca(s.nextLine());
        
        System.out.println("Ano de Fabricação: ");
        c.setanofabricacao(s.nextInt());
        
        System.out.println("Ano de Modelo: ");
        c.setanodemodelo(s.nextInt());
        
        System.out.println("Modelo: ");
        c.setmodelo(s.nextLine());
        
        c.ligar();//pergunta 6
        
        System.out.println("Insira a potencia: ");
        m.setpotencia(s.nextDouble());
        c.acelarar();
        System.out.println("Cor: "+c.getcor());
        System.out.println("Marca: "+c.getmarca());
        System.out.println("Ano de Fabricacao: "+c.getanofabricacao());
        System.out.println("Ano de Modelo: "+c.getanodemodelo());
        System.out.println("Modelo: "+c.getmodelo());
        System.out.println("Velocidade: "+c.getvelocidadeatual());
        System.out.println("Km percorridos: "+c.getkm());
        System.out.println("Litros no tanque: "+c.getlitrosnotanque());
        
    }

}
