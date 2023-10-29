package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.validator.GameValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    // TODO: 이름 길이 1글자 이상 5 이하인지 검증하기
    public List<Car> inputCarNames() {

        String cars = Console.readLine();
        GameValidator.validateCarNumberIsOverTwo(cars);

        return Arrays.stream(cars.split(","))
                .map(String::trim)
                .map(carName -> new Car(carName))
                .collect(Collectors.toList());
    }

    // TODO: 시도 횟수 1 이상인지 검증하기, int 범위로 제한하기
    public int inputTryCount() {

        String tryCount = Console.readLine();

        return Integer.parseInt(tryCount);
    }
}
