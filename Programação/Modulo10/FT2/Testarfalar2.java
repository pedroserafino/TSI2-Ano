import java.util.Scanner;
public class Testarfalar2{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Insira o tipo de pessoa (A ou a - aluno,P ou p- professor)");
        String tipoPessoa= s.nextLine();
        if(tipoPessoa.equals("F")||tipoPessoa.equals("f")){
            pessoa=new Professor("Antonio Germano","Rua dos Passeios - Caldas da Rainha",40,'M',916289344,2);
        }
        else if(tipoPessoa.equals("A")||tipoPessoa.equals("a")){
            pessoa=new Professor("Joseca Fonseca","Rua dos Passeios - Caldas da Rainha",15,'M',916289344,"2ºTSI");
        }
        else{
            pessoa = new Pessoa();
            System.out.println("o tipo de pessoa que inseriu mao existe por isso foi criado");
        }
        System.out.println("Ola!O meu nome e "+pessoa.getNome()+" sou do sexo "+pessoa.getGenero()+" e vivo na "+pessoa.getMorada+" tenho "+pessoa.getIdade()+" anos e o meu numero é "+pessoa.getNumero());
        if(pessoa instanceof Aluno){
            System.out.println("O meu numero é"+((Aluno)pessoa).getNumAluno()+"e a minha turma é "+((Aluno)pessoa).getTurma());
        }
        else if(pessoa instanceof Professor){
            System.out.println("O meu grupo de docencia e "+((Professor)pessoa).getGrupoDocencia()" e o meu escalao e " +((Professor)pessoa).getEscalao());
        }
    }
}