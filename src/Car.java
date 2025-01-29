public class Car extends Vehicle {
    String Brand ;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String Brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.Brand = Brand;
    }

    //honk method
    public void honk(){
        System.out.println("Honk, honk! ");
    }

    //display info method
    public void displayInfo(){
        System.out.println("This all the info about the: "+ Brand + " car !");
        System.out.println(numberOfWheels);
        System.out.println(color );
        System.out.println(engineSize);
        System.out.println(fuelType );
        honk();

    }
}
