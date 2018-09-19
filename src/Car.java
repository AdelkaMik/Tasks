public class Car extends Vehicle {
    private String licensePlate;
    private int count;

    public Car() {
        System.out.println("volam se tady");
        this.licensePlate = "Unknown";
        this.count = 0;
    }
    
    public Car(String s, int i){
        super(i);
        System.out.println("volam se parametrizovany konstruktor 'car' ");
        this.licensePlate = s;
    }
    
    @Override
    public void washWheels() {
        System.out.println("Car cleaned");
    }

    public String getLicenseplate(){
        return licensePlate;
    }
}
