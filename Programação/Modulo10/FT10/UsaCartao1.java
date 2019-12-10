import java.util.Scanner;
public class UsaCartao1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoCartao;
        CartaoTitular cartao = new CartaoPontos();
        
        System.out.print("Tipo de cartao: ");
        tipoCartao = sc.nextLine();
        if(tipoCartao.equals("CP") || tipoCartao.equals("cp"))
            cartao = new CartaoPontos(442167865419L, "Tiburcio Miquelino", 43.0);
        else if(tipoCartao.equals("CE") || tipoCartao.equals("ce"))
            cartao = new CartaoEscola(342167825419L, "Maria Antonieta", 55.5);
        
        System.out.println("Numero de conta: " + cartao.getNumero());
        System.out.println("Nome: " + cartao.getNomeTitular());
        System.out.println("Saldo: " + cartao.getSaldo());
    }
}