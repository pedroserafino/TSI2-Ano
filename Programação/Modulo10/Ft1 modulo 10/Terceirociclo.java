
/**
 * Escreva a descrição da classe Terceirociclo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Terceirociclo extends Funcionario
{
   private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public float getVencimento(){
       return (super.getVencimentoBase()+super.getVencimentoBase()*0.10f);
   }
   public float calculaVencimento(){
       return this.getVencimento()+ super.getComissao();
   }
}
