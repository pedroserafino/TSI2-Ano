public class Zoomorfico extends TipoRobots{
    public void speedUp() {
        super.speedUp();
        System.out.println("Temperatura: ",super.getTemperature());
    }
}