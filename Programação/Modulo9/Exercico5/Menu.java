import java.util.Scanner;
public class Menu{
    private int op;
    Scanner s= new Scanner(System.in);
    public Menu(){
        do
        {
            System.out.println("Opção 1: Medidas Retangulo");
            System.out.println("Opção 2: Medidas Triangulo");
            System.out.println("Opção 3: Medidas Circulo");
            System.out.println("Opção 4: Medidas Quadrado");
            System.out.println("Opçao 0: Sair");
            op= s.nextInt();
        }while(op>0||op<4);
        switch(op)
        {
            case 1:Constroitriangulo();break;
            case 2:Constroiretangulo();break;
            case 3:Constroiretangulo();break;
            case 4:Constroicirculo();break;
            default: System.out.println("Erro Nao foi encontrada");
        }
    }
}