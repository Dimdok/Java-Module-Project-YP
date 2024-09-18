import java.util.Scanner;

// утилитарный класс для бизнес-логики гонки
public class LeMansRace {
    Scanner scanner = new Scanner(System.in);
    Race race = new Race();

    // "magic numbers" это плохо, все параметры гонки храним в переменных
    int carCount = 3;
    int minSpeed = 1;
    int maxSpeed = 250;

    public void startTheRace() {
        System.out.println("Здравствуйте. Добро пожаловать на гонку. Кто будет участвовать?");

        for (int i = 1; i <= carCount; i++) {
            System.out.println("\nВведите название машины №" + i + ":");
            String brand = scanner.next();

            // ввод скорости и проверка на валидное значение
            while (true) {
                System.out.println("\nВведите скорость машины №" + i + ":");
                int speed;

                // проверка на ввод числа, а не строки
                try {
                    speed = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Введите число от 1 до 250");
                    scanner.nextLine();
                    continue;
                }

                // проверка на скорость
                if (speed >= minSpeed && speed <= maxSpeed) {
                    race.doTheRace(new Car(brand, speed));
                    break;
                } else {
                    System.out.println("Неправильная скорость");
                }
            }
        }

        String winnerBrand = race.winnerBrand;

        System.out.println("\nПобедитель гонки: " + winnerBrand + "!");
        System.out.println("Всего хорошего, приходите ещё.");

    }
}
