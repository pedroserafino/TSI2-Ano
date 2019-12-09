import java.util.Scanner;
public class Testarfalar3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Insira o tipo de pessoa (A ou a - aluno,P ou p- professor)");
        String tipoPessoa = s.nextLine();
        if (tipoPessoa.equals("P") || tipoPessoa.equals("p")) {
            pessoa = new Professor()
        }
        else if (tipoPessoa.equals("A") || tipoPessoa.equals("a")) {
            pessoa = new Alunos()
        }
        else {
            pessoa = new Pessoa();
            System.out.println("o tipo de pessoa que inseriu mao existe por isso foi criado");
        }
        System.out.println("Nome da pessoa?: ");
        pessoa.setNome(s.nextLine());
        System.out.println("Sexo da Pessoa?: ");
        pessoa.setGenero(s.next().charAt(0));
        System.out.println("Idade da Pessoa: ");
        pessoa.setIdade)(s.nextInt());
        System.out.println("Ola!O meu nome e "+pessoa.getNome()+" tenho " +pessoa.getIdade()+" e sou do genero "+pessoa.getGenero());
    }
}
