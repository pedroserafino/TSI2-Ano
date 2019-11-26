
/**
 * Escreva a descrição da classe Secundario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Secundario extends Terceirociclo
{
    public float getVencimentoBase(){
        return (super.getVencimentoBase()+ super.getVencimentoBase() *0.50f);
    }
    public float calculaVencimento(){
        return this.getVencimentoBase()+super.getComissao();
    }
}
