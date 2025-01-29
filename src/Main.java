//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle motorbike = new Vehicle(2,"red", 2.14f,"Petrol");

        Car McLaren = new Car(4,"Yellow", 12.6f,"Petrol", "McLadaren");


        System.out.println("The motorbike has "+ motorbike.getNumberOfWheels()+ " wheels and is color " +
                motorbike.color + " with and engine size of " +  motorbike.engineSize +" and takes "+ motorbike.fuelType + " fuel." );


        McLaren.displayInfo();

    }


}