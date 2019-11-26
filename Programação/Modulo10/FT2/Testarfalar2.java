import java.util.Scanner;
public class Testarfalar2{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Insira o tipo de pessoa (A ou a - aluno,P ou p- professor)");
        String tipoPessoa= s.nextLine();
        if(tipoPessoa.equals("F")||tipoPessoa.equals("f")){
            pessoa=new Professor("Antonio Germano","Rua dos Passeios - Caldas da Rainha",40,'M',916289344,550,2);
        }
        else if(tipoPessoa.equals("A")||tipoPessoa.equals("a")){
            pessoa=new Alunos("Joseca Fonseca","Rua dos Passeios - Caldas da Rainha",15,'M',916289344,10,"2 TSI");
        }
        else{
            pessoa = new Pessoa();
            System.out.println("o tipo de pessoa que inseriu mao existe por isso foi criado");
        }
        System.out.println("Ola!O meu nome e "+pessoa.getNome()+" sou do sexo "+pessoa.getGenero()+" e vivo na "+pessoa.getMorada()+" tenho "+pessoa.getIdade()+" anos e o meu numero é "+pessoa.getContacto());
        if(pessoa instanceof Alunos){
            System.out.println("O meu numero é"+((Alunos)pessoa).getNumAlunos()+"e a minha turma é "+((Alunos)pessoa).getTurma());
        }
        else if(pessoa instanceof Professor){
            System.out.println("O meu grupo de docencia e "+((Professor)pessoa).getGrupoDocencia()+" e o meu escalao e " +((Professor)pessoa).getEscalao());
        }
    }
}