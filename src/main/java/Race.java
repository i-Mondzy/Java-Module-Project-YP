public class Race {
    int space = 0;
    String racer = "";

    public void distance (Car[] cars) {
        int distance;
        for (Car car : cars) {
            distance = 24 * car.speed;

            if (distance > space) {
                space = distance;
                racer = car.car;
            }
        }
        System.out.println("Самая быстрая машина: " + racer);
    }
}
