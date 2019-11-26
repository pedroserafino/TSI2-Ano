import java.util.Scanner;
public class UsaContador2{
    public UsaContador2(){
    }
    public static void main(String[] args){
        Contador contad= new Contador();
        contad.setcont(0);
        Scanner s= new Scanner(System.in);
        while(contad.getcont()<=5){
            System.out.println("Carregue na tecla <<Enter>> para retirar uma senha");
            s.nextLine();
            contad.Contmais();
            contad.ContMostrar();
            if(contad.getcont()==3)
            {
             System.out.println("Carregue com mais papel");
            }
        }      
    }
}
        