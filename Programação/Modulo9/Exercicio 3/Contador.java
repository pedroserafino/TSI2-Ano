public class Contador{
     private int cont=0;
     private int numero;
     public int getnumero(){
         return numero;
     }
     public void setnumero(int num){
         this.numero=num;
     }
     public int getcont(){
         return cont;
     }
     public void setcont(int num){
         this.cont=num;
     }
      public Contador(){
     }
     public void Conta(int cont){
         this.cont=cont;
     }
     public void Contmais(){
         cont=cont+1;
        }
     public void Contmenos(){
         cont=cont-1;
     }
     public void ContMostrar(){
         System.out.println(cont);
     }
    }