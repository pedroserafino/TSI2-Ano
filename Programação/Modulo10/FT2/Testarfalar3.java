import java.util.Scanner;
public class Testarfalar3
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pessoa;
        System.out.println("Insira o tipo de pessoa (A ou a - aluno,P ou p- professor)");
        String tipoPessoa = s.nextLine();
        if (tipoPessoa.equals("F") || tipoPessoa.equals("f")) {
            pessoa = new Professor("Antonio Germano", "Rua dos Passeios - Caldas da Rainha", 40, 'M', 916289344,550,2);
        }
        else if (tipoPessoa.equals("A") || tipoPessoa.equals("a")) {
            pessoa = new Alunos("Joseca Fonseca", "Rua dos Passeios - Caldas da Rainha", 15, 'M', 916289344,23,"2ºTSI");
        }
        else {
            pessoa = new Pessoa();
            System.out.println("o tipo de pessoa que inseriu mao existe por isso foi criado");
        }
        System.out.println("Nome da pessoa?: ");
        pessoa.setNome(s.nextLine());
        System.out.println("Morada da Pessoa)?: ");
        pessoa.setMorada(s.nextLine());
        System.out.println("Sexo da Pessoa?: ");
        pessoa.setGenero(s.next().charAt(0));
        System.out.println("Contacto da Pessoa?: ");
        pessoa.setContacto(s.nextLong());
        System.out.println("Ola!O meu nome e "+pessoa.getNome()+" sou do sexo "+pessoa.getGenero()+" e vivo na "+pessoa.getMorada()+" tenho "+pessoa.getIdade()+" anos e o meu Contacto  é "+pessoa.getContacto());
    }
}
