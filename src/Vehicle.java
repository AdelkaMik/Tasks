public abstract class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        System.out.println("Volam explicitine predka");
        this.wheels = wheels;
    }

    public Vehicle() {
        System.out.println("Vola se implicitne predek");
        this.wheels = 4;
    }

    public int getWheels(){
        return wheels;
    }

    public abstract void washWheels();
}
