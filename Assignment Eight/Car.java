
public class Car{

    String make;
    String model;
    int year;
    double mpg;
    double milesDriven;
    double fuelCapacity;
    double fuelRemaining;

    public Car(){
        make = "Mazda";
        model = "Mazda 3";
        year = 2007;
        mpg = 25.5;
        milesDriven = 160000.0;
        fuelCapacity = 11.0;
        fuelRemaining = fuelCapacity;
    }

    public Car(String make, String model, int year, double mpg, double milesDriven, double fuelCapacity, double fuelRemaining){

        this.make = make;
        this.model = model;
        this.year = year;
        this.mpg = mpg;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;


    }
 
    public void fillTank(double g){
        if(g + fuelRemaining > fuelCapacity){
            fuelRemaining = fuelCapacity;
        }
        else{
            fuelRemaining += g;
        }
    }

    public void drive(double m){
        double maxMiles = fuelRemaining * mpg;
        if(m > maxMiles){
            fuelRemaining = 0;
            milesDriven += maxMiles;
        }
        else{
            fuelRemaining -= m / mpg;
            milesDriven += m;
        }
    }

    public double getFuelRemaining(){
        return fuelRemaining;
    }

    public String toString(){
        return("Make: " + make + "\nModel: " + model + 
        "\nYear: " + String.valueOf(year) + "\nMiles Per Gallon: " +
        String.valueOf(mpg) + "\nMiles Driven: " + String.valueOf(milesDriven)
        + "\nFuel Capacity: " + String.valueOf(fuelCapacity) +
        "\nFuel Remaining: " + String.valueOf(fuelRemaining) + "\n");
    }
}