public class Car {
    String car;
    int speed;

    Car(String car, int speed) {
        this.car = car;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "{car='" + car + "', speed=" + speed + "}";
    }
}
