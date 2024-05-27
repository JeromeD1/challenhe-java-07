package challengeJava07;

public abstract class Vehicle {
    //attributes
    private String brand;
    private int kilometers;

    //constructor
    public Vehicle (String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters and setters
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers () {
        return this.kilometers;
    }

    public void setKilometers (int kilometers) {
        this.kilometers = kilometers;
    }

    //abstract methods
    public abstract String doStuff();

}
