import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leader = "";

        for (int i = 0; i < 3; i ++) {
            String carName;
            int carSpeed;
            int minSpeed = 1;
            int maxSpeed = 250;

            while (true) {
                System.out.println("— Введите название машины №" + (i + 1) + ":");
              //  if (scanner.hasNextLine()) {
                    carName = scanner.nextLine();
                    if (carName.trim().isEmpty()) {
                        System.out.println("Неправильное название");
                    } else {
                        break;
               //     }
                }
            }

            while (true) {
                System.out.println("— Введите скорость машины №" + (i + 1) + ":");
                {
                    try {
                        carSpeed = Integer.parseInt(scanner.nextLine());
                        if ((carSpeed >= minSpeed) && (carSpeed <= maxSpeed)) {
                            break;
                        }
                    } catch (NumberFormatException ex) {
                    }
                    System.out.println("— Неправильная скорость ");
                }
            }
            Car car = new Car(carName, carSpeed);

            leader = Race.findLeader(car.name, car.speed);
        }
        System.out.println("Самая быстрая машина:" + leader);
    }
}
