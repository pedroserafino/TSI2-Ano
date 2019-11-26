
/**
 * Escreva a descrição da classe Ensinosuperior aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Ensinosuperior extends Secundario
{
    private String universidade;

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    public float getVencimentoBase(){
        return (super.getVencimentoBase()+super.getVencimentoBase());
    }
    public float calculaVencimento(){
        return this.getVencimentoBase() + super.getComissao();
    }
}
