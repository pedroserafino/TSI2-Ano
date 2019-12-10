public abstract class CartaoTitular{
   private long numero;
   private String nomeTitular;
   private double saldo=0;


   public long getNumero() {
       return numero;
   }

   public String getNomeTitular() {
       return nomeTitular;
   }

   public double getSaldo() {
       return saldo;
   }

   public void setNumero(long numero) {
       this.numero = numero;
   }

   public void setNomeTitular(String nomeTitular) {
       this.nomeTitular = nomeTitular;
   }

   public void setSaldo(double saldo) {
       this.saldo = saldo;
   }

   public CartaoTitular() {
       setNumero(1000);
   }

   public  void debito(double valor) { //Perg.1 Nao iria ser aceito pois um metodo abstrato nunca iria receber parametros de entrada
   }

   public void credito(double valor) {
   }

   public void detalhesConta() {
   }

   public void transferirSaldo(CartaoTitular cartao) {
   }

   public void suspenderConta() {
       setNomeTitular(" Conta Suspensa ");
   }
}
