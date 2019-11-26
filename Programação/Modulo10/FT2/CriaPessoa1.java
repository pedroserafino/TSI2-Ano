import java.util.Scanner;
public class CriaPessoa1
{
    public static void mai(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("A - a Aluno");
    System.out.println("P - p professor");
    System.out.println("indique se é aluno ou professor");
    String escolha=s.nextLine();
    Pessoa ds;
    if((escolha.equals("A")||(escolha.equals("a")))){
        ds = new Alunos();
    }
    else if((escolha.equals("P")||(escolha.equals("p")))){
        ds = new Professor();
    }
    else{
        System.out.println("Opção invalida");
        ds = new Pessoa();
    }
        System.out.println("Nome: ");
        String nome=s.nextLine();
        System.out.println("Morada: ");
        String morada=s.nextLine();
        System.out.println("Sexo: ");
        char genero=s.next().charAt(0);
        System.out.println("Idade: ");
        int idade=s.nextInt();
        System.out.println("Contacto?: ");
        long contacto=s.nextLong();
    }
}
