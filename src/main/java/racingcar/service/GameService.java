package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class GameService {

    private static final int MOVE_CONDITION = 4;
    private static final int MIN_MOVE_NUMBER = 0;
    private static final int MAX_MOVE_NUMBER = 9;


    public void moveCars(List<Car> cars) {

        cars.forEach(car -> {
            int randomNumber = makeRandomNumberForMove();
            if (isMove(randomNumber)) {
                car.move();
            }
        });
    }

    public List<String> findWinner(List<Car> cars) {

        int maxPosition = findMaxPosition(cars);

        return cars.stream()
                .filter(car -> car.getPosition().length() == maxPosition)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int makeRandomNumberForMove() {

        return Randoms.pickNumberInRange(MIN_MOVE_NUMBER, MAX_MOVE_NUMBER);
    }

    private boolean isMove(int randomNumber) {

        return randomNumber >= MOVE_CONDITION;
    }

    private int findMaxPosition(List<Car> cars) {

        return cars.stream()
                .mapToInt(car -> car.getPosition().length())
                .max()
                .orElse(0);
    }
}
