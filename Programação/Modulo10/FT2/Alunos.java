public class Alunos extends Pessoa
{
    private int numAlunos;
    private String turma;

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    public Aluno(){}
    public Aluno(String nome,String morada,int idade,char genero,long contacto,String turma,int numAlunos)
    {
        super(nome,morada,idade,genero,contacto);
        this.turma=turma;
        this.numAlunos=numAlunos;
    }
    public falar()
    {
        super.falar();
        System.out.println("e sou aluno");
    }
}
