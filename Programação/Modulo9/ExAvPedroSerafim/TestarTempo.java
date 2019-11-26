import java.text.DecimalFormat;
public class TestarTempo
{
   public static void main(String[] args)
   {

       Atleta a= new Atleta();
       DadosFisicos dfis = new DadosFisicos();
       DecimalFormat df = new DecimalFormat("0.00");
       
       a.setNome("Pedro Miguéis");
       a.setContacto(351912340762L);
       a.setnacionalidade("Potuguesa");
       a.setNumeroCamisa(7);
       a.setPosicao("Centroavante");
       a.isStatus(false);
       dfis.setPeso(98);
       dfis.setAltura(1.88);
       dfis.setIdade(25);
       a.exibirDados();
              
       double result=dfis.calcularImc();
       if(result<=18.5)
          System.out.prinln("O IMC do atleta é de "+df(result)+"<=18.5 - Jogador tem peso abaixo da normalidade");
       else if(result>18.5||result<=25)
          System.out.prinln("O IMC do atleta é de "+df(result)+">18.5 e <=25 - Jogador tem peso dentro da normalidade");
       else if(result>25||result<=30)
            System.out.prinln("O IMC do atleta é de "+df(result)+">25 e <=30 - Jogador tem peso acima da normalidade");
       else if(result>30)
            System.out.println("O IMC do atleta é de "+de(result)+">30 -jogador está obeso");
            
       if(a.alterarStatus()==-1 && result <=30)
            System.out.println("Jogador não pode ser titular\nO seu peso está abaixo da normalidade");
       else if(a.alterarStatus()==-1 && result>25 && result <30)
            System.out.println("Jogador não pode ser titular\no seu peso está acima da normalidade");
       else if(a.alterarStatus()==-1 && result>30)
            System.out.prinln("Jogador nao pode ser titular\nO seu peso está completamente fora da normalidade,obeso!");
       else
        System.out.println("O atleta agora é titular");
   }
}
