
/**
 * Escreva a descrição da classe CarroPasseio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Condutor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int idade;
    private boolean cartaconducao=false;
    
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    
    public int getidade(){
        return idade;
    }
    public void setidade(int idade){
        this.idade=idade;
    }
    
    public boolean getcartaconducao(){
        return cartaconducao;
    }
    public void setcartaconducao(boolean cartaconducao){
        this.cartaconducao=cartaconducao;
    }
    
    /**
     * COnstrutor para objetos da classe CarroPasseio
     */
    public Condutor()
    {
    }
    public void RegCond(String nome,int idade,boolean c){
        this.nome=nome;
        this.idade=idade;
        this.cartaconducao=c;
    }
    
    public boolean PermCond(){
        if(!cartaconducao){
            System.out.println("O Condutor nao possui Carta de conduçao");
            return true;
        }
        else{
            System.out.println("O Condutor nao possui Carta de conduçao");
            return false;
        }
    }
}
