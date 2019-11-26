import java.util.Scanner;

public class Bissexto{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int ano;
        
        System.out.printf("Informe o ano da data: ");
        ano= ler.nextInt();
        
        if((((ano % 4) == 0) && ((ano %100) !=0)) || ((ano %400) == 0))
            System.out.printf("\n O ano informado = Bissexto.\n");
        else
            System.out.println("\n O nao Informado <> Bissexto.\n");
        }
    }