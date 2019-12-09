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
<<<<<<< HEAD
          System.out.println("4. Desligar robot.");
          System.out.println("5. Robot explorador. ");
          System.out.println("6. Trazer robot.");
          System.out.println("7. Sair.");
          System.out.println("Opção: ");
          op=s.nextInt();
      }while(op<0 || op>7);
=======
          System.out.println("4. Parar robot.");
          System.out.println("5. Trazer robot.");
          System.out.println("6. Robot explorador. ");
          System.out.println("7. Desligar robot.");
          System.out.println("8. Sair.");
          System.out.println("Opção: ");
          op=s.nextInt();
      }while(op<0 || op>8);
      return op;
>>>>>>> 950e4c0509c5d73566046ad87638a2123ab59a90
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
<<<<<<< HEAD
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
=======
        String nome;
        double speed, temperature;
        byte status=1;
        Robot robo;//Variaveis



         do{
        op=menu();
        switch(op){
            case 1:
                    System.out.print("Qual o tipo de robot(Androide ou Zoomorfico): \n");
                    if(s.nextLine().equals("Androide")){
                        robo = new Androide();
                    }
                    else if(s.nextLine().equals("Zoomorfico")){
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
                  robo.setCurrentSpeed(robo.getSpeed());
                  System.out.println("Bateria: ");
                  robo.setPower(s.nextInt());
                  break;
                case 2:

                System.out.println("indique o nome do Robot: ");

                for(i=0;i<rob.size();i++)
                {
                  if(rob.get(i).getName().equals(s.nextLine()))
                  {
                      rob.remove(i);
                      System.out.print("Qual o tipo de robot(Androide ou Zoomorfico): \n");
                              if(s.nextLine().equals("Androide")){
                                  robo = new Androide();
                              }
                              else if(s.nextLine().equals("Zoomorfico")){
                                  robo = new Zoomorfico();
                              }
                              else{
                                  robo = new Robot();
                              }
                      rob.add(i,robo);
                      System.out.println("Qual o novo nome do Robot?: ");
                      robo.setName(s.nextLine());

                      System.out.println("Qual a velocidade do Robot?: ");
                      robo.setCurrentSpeed(s.nextDouble());

                      System.out.println("Qual a Quantidade de Bateria?: ");
                      robo.setPower(s.nextInt());

                  }
                  else{
                    System.out.println("Nome de Robo Nao Encontrado.");
                  }
                }
                break;
                case 3:int j=0;
                 for(i=0;i<rob.size();i++){
                      j=j+1;//Listagem
                    System.out.println("Robot nr. "+ j);
                    System.out.println("Nome: "+ rob.get(i).getName());
                    System.out.println("Velocidade: "+ rob.get(i).getCurrentSpeed());
                    System.out.println("Bateria: "+ rob.get(i).getPower());
                    System.out.println("-----------------");
                    }
                    break;

                case 4:
                        for(i=0;i<rob.size();i++){  //Listagem
                          System.out.println("Robot nr. "+ i+1);
                          System.out.println("Nome: "+ rob.get(i).getName());
                          System.out.println("Velocidade: "+ rob.get(i).getCurrentSpeed());
                          System.out.println("Bateria: "+ rob.get(i).getPower());
                        }

                      System.out.println("Qual Robo Deseja eliminar?: ");
                      for(i=0;i<rob.size();i++)
                      {
                        if(rob.get(i).getName().equals(s.nextLine()))
                        {
                          rob.remove(i);
                        }
                        else
                        {
                          System.out.println("Robot "+rob.get(i).getName()+" Nao Encontrado");
                        }
                      }
                      break;
              case 5:
              do{
              subop=submenu();
              switch(subop){
                          case 1:op=menu();
                          break;
                          case 2: System.out.println("Qual o nome do Robot que pertende acelerar?: "); //Robot a acelarar
                                  String str2=s.nextLine();
                                  for(i=0;i<rob.size();i++)
                                  {
                                  if(rob.get(i).getName().equals(str2))
                                  {
                                        System.out.println("Velocidade atual: "+rob.get(i).getCurrentSpeed());
                                        rob.get(i).speedUp();
                                        System.out.println("Velocidade após a acelaração: "+rob.get(i).getCurrentSpeed());
                                  }
                                }
                                break;
                        case 3: System.out.println("Qual o nome do Robot que pertende travar?: ");//Robot a reduzir
                                String str=s.nextLine();
                                for(i=0;i<rob.size();i++)
                                {
                                if(rob.get(i).getName().equals(str))
                                {
                                    System.out.println("Velocidade atual: "+rob.get(i).getCurrentSpeed());
                                    rob.get(i).speedDown();
                                    System.out.println("Velocidade após a travagem: "+rob.get(i).getCurrentSpeed());
                                }
                              }
                              break;
                        case 4: System.out.println("Qual o nome do Robot que pertende reduzir a velocidade?: "); //Robot trava tudo
                                str=s.nextLine();
                                for(i=0;i<rob.size();i++)
                                {
                                if(rob.get(i).getName().equals(str))
                                {
                                    System.out.println("Velocidade atual: "+rob.get(i).getCurrentSpeed());
                                    rob.get(i).breaking();
                                    System.out.println("Velocidade após a travagem: "+rob.get(i).getCurrentSpeed());
                                }
                              }
                              break;
                          case 5: System.out.println("Qual o nome do Robot que pertende traze-lo de volta?: ");
                                  str=s.nextLine();
                                  for(i=0;i<rob.size();i++)
                                  {
                                  if(rob.get(i).getName().equals(str))
                                  {
                                      rob.get(i).returning();
                                      System.out.println("o robot "+rob.get(i).getName()+" está de volta à base!");
                                  }
                                }
                                break;
                          case 6: System.out.println("Qual o nome do Robot que pertende envia-lo para explorar?: ");
                                  str=s.nextLine();
                                  for(i=0;i<rob.size();i++)
                                  {
                                  if(rob.get(i).getName().equals(str))
                                  {
                                      rob.get(i).exploring();
                                      System.out.println("o robot "+rob.get(i).getName()+" vai por ai SOZINHO! CUIDADO!");
                                  }
                                }
                                  break;
                          case 7: System.out.println("Qual o nome do Robot que pertende desligar?: ");
                                  str=s.nextLine();
                                  for(i=0;i<rob.size();i++)
                                  {
                                  if(rob.get(i).getName().equals(str))
                                  {
                                      rob.get(i).standBy();
                                      System.out.println("o robot "+rob.get(i).getName()+" encontra-se desligado!");
                                  }
                                }
                                break;
                        case 8:op=6;
                        System.out.println(subop);
                        break;
                        }
                      }while(subop!=1||subop!=8);
                      break;
      }

  }while(op!=6);
>>>>>>> 950e4c0509c5d73566046ad87638a2123ab59a90
}
}
