
public class UsaCartao {

    public static void main(String[] args) {

        CartaoPontos cartaoPontos = new CartaoPontos();
        cartaoPontos.setNumero(342167865419L);
        cartaoPontos.setNomeTitular("Titular1");
        cartaoPontos.setSaldo(50.0);

        CartaoEscola cartaoEscola = new CartaoEscola();
        cartaoEscola.setNumero(342467865419L);
        cartaoPontos.setNomeTitular("Titular2");
        cartaoPontos.setSaldo(30.0);

        CartaoPontos cartaoPontos1 = new CartaoPontos(342667865419L, "Titular3", 70.0);
        
        CartaoEscola cartaoEscola1 = new CartaoEscola(342567865419L, "Titular4", 90.0);

        System.out.println("Cartao : 1");
        System.out.println("Numero: " + cartaoPontos.getNumero());
        System.out.println("Nome: " + cartaoPontos.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos.getSaldo());
        System.out.println("Cartao : 2");
        System.out.println("Numero: " + cartaoEscola.getNumero());
        System.out.println("Nome: " + cartaoEscola.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola.getSaldo());
        System.out.println("Cartao : 3");
        System.out.println("Numero: " + cartaoPontos1.getNumero());
        System.out.println("Nome: " + cartaoPontos1.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos1.getSaldo());
        System.out.println("Cartao : 4");
        System.out.println("Numero: " + cartaoEscola1.getNumero());
        System.out.println("Nome: " + cartaoEscola1.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola1.getSaldo());

        cartaoPontos.credito(45.5);
        cartaoEscola1.credito(50.0);

        System.out.println("Cartao : 1");
        System.out.println("Numero: " + cartaoPontos.getNumero());
        System.out.println("Nome: " + cartaoPontos.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos.getSaldo());
        System.out.println("Cartao : 2");
        System.out.println("Numero: " + cartaoEscola.getNumero());
        System.out.println("Nome: " + cartaoEscola.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola.getSaldo());
        System.out.println("Cartao : 3");
        System.out.println("Numero: " + cartaoPontos1.getNumero());
        System.out.println("Nome: " + cartaoPontos1.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos1.getSaldo());
        System.out.println("Cartao : 4");
        System.out.println("Numero: " + cartaoEscola1.getNumero());
        System.out.println("Nome: " + cartaoEscola1.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola1.getSaldo());

        cartaoPontos.transferirSaldo(cartaoPontos1);
        cartaoEscola1.transferirSaldo(cartaoEscola);

        System.out.println("Cartao : 1");
        System.out.println("Numero: " + cartaoPontos.getNumero());
        System.out.println("Nome: " + cartaoPontos.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos.getSaldo());
        System.out.println("Cartao : 2");
        System.out.println("Numero: " + cartaoEscola.getNumero());
        System.out.println("Nome: " + cartaoEscola.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola.getSaldo());
        System.out.println("Cartao : 3");
        System.out.println("Numero: " + cartaoPontos1.getNumero());
        System.out.println("Nome: " + cartaoPontos1.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos1.getSaldo());
        System.out.println("Cartao : 4");
        System.out.println("Numero: " + cartaoEscola1.getNumero());
        System.out.println("Nome: " + cartaoEscola1.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola1.getSaldo());

        cartaoPontos1.debito(20.0);
        
        System.out.println("Cartao : 1");
        System.out.println("Numero: " + cartaoPontos.getNumero());
        System.out.println("Nome: " + cartaoPontos.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos.getSaldo());
        System.out.println("Cartao : 2");
        System.out.println("Numero: " + cartaoEscola.getNumero());
        System.out.println("Nome: " + cartaoEscola.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola.getSaldo());
        System.out.println("Cartao : 3");
        System.out.println("Numero: " + cartaoPontos1.getNumero());
        System.out.println("Nome: " + cartaoPontos1.getNomeTitular());
        System.out.println("Saldo: " + cartaoPontos1.getSaldo());
        System.out.println("Cartao : 4");
        System.out.println("Numero: " + cartaoEscola1.getNumero());
        System.out.println("Nome: " + cartaoEscola1.getNomeTitular());
        System.out.println("Saldo: " + cartaoEscola1.getSaldo());
    }

}
