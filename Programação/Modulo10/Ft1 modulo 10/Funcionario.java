
/**
 * Escreva a descrição da classe funcionario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Funcionario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int codigoFuncionario;
    private String nomeFuncionario;
    private final float vencimentoBase =500.00f;
    private float comissao;

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getVencimentoBase() {
        return vencimentoBase;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    public float calculaVencimento(){
        return vencimentoBase+comissao;
    }
    public Funcionario()
    {
    }
}
