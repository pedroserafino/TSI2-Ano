import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
    public static int submenu(){
      int op;
      Scanner s = new Scanner(System.in);
      do{
          System.out.println("1. Gerir robots. ");
          System.out.println("2. Acelerar robot.");
          System.out.println("3. Travar robot.");
          System.out.println("4. Desligar robot.");
          System.out.println("5. Robot explorador. ");
          System.out.println("6. Trazer robot.");
          System.out.println("7. Sair.");
          System.out.println("Opção: ");
          op=s.nextInt();
      }while(op<0 || op>7);
    }
    public static int menu(){
        int op;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("1. Inserir novo robot. ");
            System.out.println("2. Editar robot.");
            System.out.println("3. Listar robot.");
            System.out.println("4. Remove robot.");
            System.out.println("5. Acesso Robo. ");
            System.out.println("6. Sair.");
            System.out.println("Opção: ");
            op=s.nextInt();
        }while(op<0 || op>6);
        return op;
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Robot> rob = new ArrayList<Robot>();
        int op, power, i, subop, resp;
        String str, nome;
        double speed, temperature;
        byte status=1;
        Robot robo;//Variaveis



         do{
        op=menu();
        switch(op){
            case 1: System.out.println("Qual o tipo de robot(Androide ou Zoomorfico): ");
                    str = s.nextLine();
                    if(str.equals("Androide")){
                        robo = new Androide();
                    }
                    else if(str.equals("Zoomorfico")){
                        robo = new Zoomorfico();
                    }
                    else{
                        robo = new Robot();
                    }
                  rob.add(robo);
                  System.out.println("Nome: ");
                  robo.setName(s.nextLine());
                  System.out.println("Velocidade: ");
                  robo.setSpeed(s.nextDouble());
                  System.out.println("Bateria: ");
                  robo.setPower(s.nextInt());
                  break;
        case 2:

                System.out.println("indique o nome do Robot: ");
                str=s.nextLine();
                for(i=0;i<rob.size();i++)
                {
                  if(rob.get(i).getName().equals(str))
                  {
                    do{
                    System.out.println("O que deseja Alterar do Robo "+rob.get(i).getName()+"? ");
                    System.out.println("1. Nome! ");
                    System.out.println("2. Velocidade! ");
                    System.out.println("3. Bateria! ");
                  }while(op<0||op>3);

                    if(resp==1)
                    {
                      System.out.println("Qual o novo nome do Robot?: ");
                      rob.set(i).setName(s.nextLine());
                    }
                    else if(resp==2)
                    {
                      System.out.println("Qual a velocidade do Robot?: ");
                      rob.set(i,robo.setSpeed(s.nextDouble()));
                    }
                    else if(resp==3)
                    {
                      System.out.println("Qual a Quantidade de Bateria?: ");
                      rob.set(i).setPower(s.nextInt());
                    }
                  }
                  else{
                    System.out.println("Nome de Robo Nao Encontrado.");
                  }
                }
        case 3: for(i=0;i<rob.size();i++){  //Listagem
                    System.out.println("Robot nr. "+ i+1);
                    System.out.println("Nome: "+ rob.get(i).getName());
                    System.out.println("Velocidade: "+ rob.get(i).getSpeed());
                    System.out.println("Bateria: "+ rob.get(i).getPower());
                    }
      case 4:/*do {
                subop=submenu();
                switch(subop){

                }
              }while(subop!=5);
      } while ();*/
      break;
    }
  }while(op!=5);
}
}
