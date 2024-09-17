import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String inputCar = scanner.nextLine();

            int inputSpeed = -1;
            while (inputSpeed < 0 || inputSpeed > 250) {
                System.out.println("Введите скорость машины от 0 до 250 №" + i + ":");
                if (scanner.hasNextInt()) {
                    inputSpeed = scanner.nextInt();
                    scanner.nextLine();
                    if (inputSpeed < 0 || inputSpeed > 250) {
                        System.out.println("Неправильная скорость");
                    }
                } else {
                    System.out.println("Введите целое число!");
                    scanner.next();
                    scanner.nextLine();
                }
            }
            cars[i - 1] = new Car(inputCar, inputSpeed);
        }
        Race race = new Race();
        race.distance(cars);
    }
}