import java.util.Scanner;

public class UsaPessoa{
    public UsaPessoa(){}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Pessoa pessoa1;
        
        pessoa1 = new Pessoa();
        pessoa1.nome= "Camilla";
        pessoa1.genero='F';
        pessoa1.idade= 12;
        
        System.out.println("O objeto pessoal chama-se "+pessoa1.nome+"E do sexo: "+pessoa1.genero+" com "+pessoa1.idade+" anos de idade e diz o seguinte"); 
        pessoa1.falar ();
        
        Pessoa pessoa2;
        
        pessoa2 = new Pessoa();
        pessoa2.nome= "Esdrubal";
        pessoa2.genero='M';
        pessoa2.idade= 67;
        
        System.out.println("\nO objeto pessoal chama-se "+pessoa2.nome+"E do sexo: "+pessoa2.genero+" com "+pessoa2.idade+" anos de idade e diz o seguinte"); 
        pessoa2.falar ();
        
        Pessoa pessoa3;
        
        System.out.println("\nIndique o nome da Pessoa: ");
        String n = s.nextLine();
        
        System.out.println("\nIndique o Sexo (F/M): ");
        String gen = s.nextLine();
        char g=gen.charAt(0);
        
        System.out.println("\nIndique a idade : ");
        int i =s.nextInt();
        
        pessoa3 = new Pessoa(n,g,i);
        System.out.println("O objeto Pessoa3 chama-se "+pessoa3.nome+"É do Sexo "+pessoa3.genero+" e tem " +pessoa3.idade+"anos e diz o seguinte: ");
        pessoa3.falar();
        
    }
}