public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Renault", 120);
        Boat boat = new Boat("Jeanneau", 0);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());

    }
}
