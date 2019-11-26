public class Corrida{
    public Corrida(){
    }

    public static void main(String[] args)
    {
        CarroCorrida carroEquipa1 =new CarroCorrida();
        CarroCorrida carroEquipa2 =new CarroCorrida();

        carroEquipa1.numeroIdentificacao="95";
        carroEquipa2.numeroIdentificacao="88";

        Piloto piloto1= new Piloto();
        Piloto piloto2=new Piloto();
        
        Motor motor1= new Motor();
        Motor motor2= new Motor();
        
        motor1.potencia= 50;
        motor2.potencia=50;

        piloto1.nome="Faisca";
        piloto1.idade=5;
        piloto1.destreza=50;

        piloto2.nome="JJBOCE";
        piloto2.idade=88;
        piloto2.destreza=20;

        carroEquipa1.piloto=piloto1;
        carroEquipa2.piloto=piloto2;
        
        carroEquipa1.motor=motor1;
        carroEquipa2.motor=motor2;

        carroEquipa1.ligar();
        carroEquipa2.ligar();

        carroEquipa1.acelerar ();
        carroEquipa2.acelerar ();
        carroEquipa1.acelerar ();
        carroEquipa2.travar (10);
        carroEquipa1.acelerar ();
        carroEquipa1.travar (5);
        carroEquipa2.acelerar ();
        carroEquipa1.acelerar ();
        
        //carroEquipa2.velocidadeatual = 300.0f;
        System.out.println("Velocidade do carro 1: "+carroEquipa1.velocidadeatual);
        System.out.println("Velocidade do carro 2: "+carroEquipa2.velocidadeatual);
        carroEquipa1.desligar();
        carroEquipa2.desligar();

        
    }
}