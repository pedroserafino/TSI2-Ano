import java.util.Scanner;
public class Testarfalar4
{
    public static void main(String[] args)
    {
        Alunos aluno= new Alunos();
        Scanner s=new Scanner(System.in);
        System.out.println("Escreva a frase que deseja ser proferida pelo aluno: ");
        String frase=s.nextLine();
        aluno.falar(frase);
    }
}
