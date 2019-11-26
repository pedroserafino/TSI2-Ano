/** switch (expression) {
 * case value1:
    statement sequence
    break;
case value2:
    statement sequence
    break;
case value3
    statement sequence
    break;
default:
   default statement sequence;
 */

import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        int dia , mes, anoNasc,anoAtual,maxDia=0;
        String nomeMes;
        
        System.out.println("Em numero, informe o mes de nascimento");
        //mes = new Scanner(system.in).nextInt();
        
        Scanner sc = new Scanner(System.in);
        mes = sc.nextInt();
        
        while(mes > 12 || mes <=0){
            System.out.println("mes informado invalido");
            System.out.println("informe o mes de nascimento");
            mes= new Scanner(System.in).nextInt();
        }
        switch (mes){
        case 1:
            nomeMes= "janeiro";
            maxDia=31;
            break;
        case 2:
            nomeMes="fevereiro";
            maxDia=28;
            break;
        case 3:
            nomeMes="março";
            maxDia=31;
            break;
        case 4:
            nomeMes="abril";
            maxDia=30;
            break;
        case 5:
            nomeMes="maio";
            maxDia=31;
            break;
        case 6:
            nomeMes="junho";
            maxDia=30;
            break;
        case 7:
            nomeMes="julho";
            maxDia=31;
            break;
        case 8:
            nomeMes="agosto";
            maxDia=31;
            break;
        case 9:
            nomeMes="setembro";
            maxDia=30;
            break;
        case 10:
            nomeMes="outubro";
            maxDia=31;
            break;
        case 11:
            nomeMes="novembro";
            maxDia=30;
            break;
        case 12:
            nomeMes="dezembro";
            maxDia=31;
            break;
        default:
            System.out.println("mes invalido");
        }
        while(dia > maxDia || dia <=0){
            System.out.println(nomeMes+ " tem " +maxDia + " dias");
            System.out.println("dia informado invalido");
            System.out.println("informe o dia de nascimento");
            dia = new Scanner(System.in).nextInt();
        }
        System.out.println("Favor informar o ano atual");
        anoAtual = new Scanner(System.in).nextInt();
        System.out.println("Favor informe o ano de nascimento");
        anoNasc = new Scanner(System.in).nextInt();
        
        System.out.println("Voce nasceu em: "+ dia +" de " +nomeMes);
        int idade = anoAtual - anoNasc;
        System.out.println("Voce tem ou tera neste ano "+idade+" anos");
        if(mes==3){
            if(dia>=21)
                System.out.println("o seu signo é Carneiro");
            else
                System.out.println("o seu signo é Peixe");}
        else if(mes==4){
            if(dia>=21)
                System.out.println("o seu signo é Cancer");
            else
                System.out.println("o seu signo é Gemeos");}
        else if(mes==5){
            if(dia>=21)
                System.out.println("o seu signo Gemeos");
            else
                System.out.println("o seu signo Touro");}
        else if(mes==6){
            if(dia>=21)
                System.out.println("o seu signo é Cancer");
            else
            System.out.println("o seu signo é Gemeos");}
        else if(mes==7){
            if(dia>=22)
                System.out.println("o seu signo é Leao");
            else
                System.out.println("o seu signo Cancer");}
        else if(mes==8){
            if(dia>=23)
                System.out.println("o seu signo é Virgem");
            else
                System.out.println("o seu signo é Leao");}
        else if(mes==9){
            if(dia>=23)
                System.out.println("o seu signo é Libra");
            else
                System.out.println("o seu signo é Virgem");}
        else if(mes==10){
            if(dia>=23)
                System.out.println("o seu signo é Escorpiao");
            else
                System.out.println("o seu signo é Libra");}
        else if(mes==11){
            if(dia>=23)
                System.out.println("o seu signo é Sagitario");
            else
                System.out.println("o seu signo é Escorpiao");}
        else if(mes==12){
            if(dia>=22)
                System.out.println("o seu signo é Capricornio");
           else
                System.out.println("o seu signo é Sagitario");}
        else if(mes==1)
            if(dia>=21)
                System.out.println("o seu signo é Aquario");
            else
                System.out.println("o seu signo é Capricornio");
        else if(mes==2){
            if(dia>=20)
                System.out.println("o seu signo é Peixe");
            else
                System.out.println("o seu signo é Aquario");}
            }
        }
         
              
       
            