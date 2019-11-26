import java.util.Scanner;
public class IdadeAdulta{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n=10;
        int idade[]=new int[n];
        int i;
        
        int menor,posmenor,maior,posmaior;
        
        for(i=0;i<n;i++)
        {
            System.out.printf("Informe a idade da %2da, pessoa de %d: ",(i+1),n);
            idade[i]= ler.nextInt();
        }
        
        menor =idade[0];posmenor = 0;
        maior=idade[0];posmaior=0;
        
        for(i=0;i<n;i++){
            if(idade[i]<menor){
                menor=idade[i];
                posmenor = i;
            }
            else if(idade[i]>maior){
                maior=idade[i];
                posmaior=i;
            }
        }
        System.out.printf("\nA maior Idade é de %d e encontra-se na posição %d",maior,(posmaior+1));
        System.out.printf("\nA menor Idade é de %d e encontra-se na posição %d\n",menor,(posmenor+1));
    }
}
        