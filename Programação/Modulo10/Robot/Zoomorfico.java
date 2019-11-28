/*
 * Pedro Serafim,Jose Pereira e Guilherme Morgado
 */
public class Zoomorfico extends TipoRobots{
    public void speedUp() {
        super.speedUp();
        System.out.println("Temperatura: ",super.getTemperature());
    }
}