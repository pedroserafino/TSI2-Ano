import java.util.Scanner;
public class Calculavencimento
{
   public static void main(String[] args)
   {
       Scanner s= new Scanner (System.in);
       System.out.println("Insira as suas Habilitacoes: sem estudos, 3 ciclo, Secundario, Superior: ");
       String habilitacoesLiterais =s.nextLine();
       System.out.println("Insira o cargo: gerente, supervisor, vendedor: ");
       String cargo= s.nextLine();
       
       Comissao comissao;
       Funcionario func= new Funcionario();
       
       if(habilitacoesLiterais.equals("sem estudos"))
            func= new Funcionario();
       else if(habilitacoesLiterais.equals("3 ciclo"))
            func = new Terceirociclo();
       else if(habilitacoesLiterais.equals("Secundario"))
            func = new Secundario();
       else if(habilitacoesLiterais.equals("Superior"))
            func = new Ensinosuperior();
       if(cargo.equals("gerente"))
            comissao = new Gerente();
       else if(cargo.equals("supervisor"))
            comissao = new Supervisor();
       else 
            comissao= new Vendedor();
            
       System.out.println("Vencimento sem comissao: "+func.getVencimentoBase());
       System.out.println("Comissao: "+comissao.getComissao());
       func.setComissao(comissao.getComissao());
       System.out.println("Vencimento com emissao: "+func.calculaVencimento());
    }        
    
}
