// класс для вычисления победителя
public class Race {
    String winnerBrand = "";
    int winnerDistance = 0;
    int raceTime = 24;

    public void doTheRace(Car car) {
        // Непонятно зачем вычислять дистанцию.
        // При одинаковом времени победитель - это всегда машина с самой большой скоростью
        int newCarDistance = car.speed * raceTime;

        if (newCarDistance > winnerDistance) {
            winnerDistance = newCarDistance;
            winnerBrand = car.brand;
        }
    }
}
