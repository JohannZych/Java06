public abstract class Vehicle {
    String Brand;
    int kilometers;


    public Vehicle(String brand, int kilometers) {
        Brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

}
