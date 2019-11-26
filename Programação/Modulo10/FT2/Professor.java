
/**
 * Escreva a descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Professor extends Pessoa
{
   private int grupoDocencia;
   private int escalao;

    public int getGrupoDocencia() {
        return grupoDocencia;
    }

    public void setGrupoDocencia(int grupoDocencia) {
        this.grupoDocencia = grupoDocencia;
    }

    public int getEscalao() {
        return escalao;
    }

    public void setEscalao(int escalao) {
        this.escalao = escalao;
    }
    public Professor(){}
    public Professor(String nome,String morada,int idade,char genero,long contacto,int grupoDocencia,int escalao)
    {
        super (nome,morada,idade,genero,contacto);
        this.grupoDocencia=grupoDocencia;
        this.escalao=escalao;
    }
    public void falar(){
        super.falar();
        System.out.println(" e sou um professor");
    }
}
