public class CartaoPontos extends CartaoTitular{
   
    public CartaoPontos() {
    }

    public CartaoPontos(long numero, String nomeTitular, double saldo) {
        super.setNumero(numero);
        super.setNomeTitular(nomeTitular);
        super.setSaldo(saldo);
    }
    
    public void debito(double valor) {
        super.setSaldo(super.getSaldo() - valor);
    }

    public void credito(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    public void detalhesConta() {
        System.out.println("\nNumero: " + super.getNumero() + "\nSaldo: " + super.getSaldo());
    }

    public void transferirSaldo(CartaoTitular cartao) {
        cartao.setSaldo(super.getSaldo());
        super.setSaldo(0.0);
    }
}
