public class Car extends Vehicle {

    String Brand ;
    String Model ;


    public void honk(){
        System.out.println("Honk, honk! ");
    }

    public void displayInfo(){
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(numberOfWheels);
        System.out.println(color );
        System.out.println(engineSize);
        System.out.println(fuelType );
        System.out.println();

        honk();

    }
}
