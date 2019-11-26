import java.util.Scanner;

public class Corrida{
    //Construtores
    public Corrida(){
    }
    //7Métodos
    public static void main(String[] args){
        /*
         *Cria objetos carro1 e carro2 que são instancias da classe carro
         */
        Carro carro1= new Carro();
        Carro carro2= new Carro();
        
        /*
         *Define valores para o atributo matrícula dos objetos carro1 e carro2 
         */
        carro1.matricula="11-AA-11";
        carro2.matricula="22-BB-22";
        /*Cria os objetos condutor1 e condutor2 que sao instâncias da classe Condutor 
         * e irao conduzir os carros
         */
        Condutor condutor1= new Condutor ();
        Condutor condutor2= new Condutor();
        /*Define os valores para os  atributos condutor1
         */
        condutor1.nome="Antonio";
        condutor1.idade=25;
        condutor1.destreza=75;
        /*Define os valores para os atributos condutor2
         */
        condutor1.nome="Manuel";
        condutor1.idade=27;
        condutor1.destreza=65;
        //Coloca os condutores nos seus carros
        carro1.condutor=condutor1;
        carro2.condutor=condutor2;
        //liga carros
        carro1.ligar();
        carro2.ligar();
        //Inicia a corrida
        carro1.acelarar ();
        carro2.acelarar ();
        carro1.acelarar ();
        carro2.travar (10);
        carro1.acelarar ();
        carro1.travar (5);
        carro2.acelarar ();
        
        carro2.velocidadeatual=300;
        System.out.println("Velocidade do carro 1: "+carro1.velocidadeatual);
        System.out.println("Velocidade do carro 2: "+carro2.velocidadeatual);
        carro1.desligar();
        carro2.desligar();

    }
}
        