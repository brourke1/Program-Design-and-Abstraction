public class CarMain{
    public static void main(String[] args){
        Car myCar = new Car();
        System.out.println(myCar);

        Car VWBug = new Car("Volkswagen", "Beetle", 1972, 10.0, 200000, 5.0, 0.1);
        System.out.println(VWBug);

        VWBug.drive(1);
        System.out.println(VWBug);

        VWBug.fillTank(10);
        System.out.println(VWBug.getFuelRemaining()); 
    }
}