

/**
 *
 * Guilherme Morgado, José Pereira, Pedro Serafim
 * 28-11-2019
 *
 */
public class Robot{

    private String name;
    private double speed;
    private double temperature;
    private byte status;
    private int power;
    private int maxSpeed=400;
    private double currentSpeed;

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getPower() {
        return power;
    }

    private int getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) { //Se fosse private
        this.speed = speed;
    }
    public void setPower(int power){
      this.power=power;
    }

    public Robot(){

    }

    public Robot(String name){
        this.name=name;
    }


    public Robot(String name, double speed, double temperature, byte status, int power){
        this.name=name;
        this.speed=speed;
        this.temperature=temperature;
        this.status=status;
        this.power=power;
    }

    public String toString(){
        return "Nome:: " + this.getName() + "\n" +"Velocidade: " + this.getSpeed() + "\n" +"Temperatura: " + this.getTemperature() + "\n" +"Status: " + this.status + "\n" +"Bateria: " + this.getPower() + "%";
    }

    public void show(){
        System.out.println(this.toString());
    }

    public void stop(){
        this.currentSpeed=0;
        if(this.temperature - 10 >= 0)
           this.temperature-=10;
        this.status=4;

    }

    public void speedUp(double speed) {
        if(this.currentSpeed + speed <= this.maxSpeed) {
            this.currentSpeed += speed;
            this.temperature += (speed * 0.5);
            this.status = 2;
        }
    }

    public void speedUp() {
        if(this.currentSpeed + (this.currentSpeed * 0.1) <= this.maxSpeed) {
            double speed = this.currentSpeed * 0.1;
            this.currentSpeed += speed;
            this.temperature += (speed * 0.5);
            this.status = 2;
        }
    }

    public void speedDown(double speed) {
        if(this.currentSpeed - speed >= 0) {
            this.currentSpeed -= speed;
            this.temperature -= (speed * 0.5);
            if(this.currentSpeed == 0)



                this.status = 4;
        }
    }
    public void speedDown() {
        if(this.currentSpeed - speed >= 0) {
            this.currentSpeed -= speed;
            this.temperature -= (speed * 0.5);
            if(this.currentSpeed == 0)
                this.status = 4;
        }
    }

    public void breaking() {
        this.currentSpeed -= (this.currentSpeed * 0.1);
        if(this.currentSpeed <= 0) {
            this.currentSpeed = 0;
            this.status = 4;
        }
    }

    public void standBy(){
        this.currentSpeed=0;
        this.temperature=0.0;
        this.status=1;
    }

    public void exploring(){
        if(this.status==4)
           this.status=3;
        this.temperature += 20.0;
    }

    public void returning() {
        if(this.status == 2)
            this.status=5;
    }
}
