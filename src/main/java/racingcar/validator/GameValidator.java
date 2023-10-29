package racingcar.validator;

public class GameValidator {

    public static void validateCarNumberIsOverTwo(String cars) {

        if (!cars.contains(",")) {

            throw new IllegalArgumentException("자동차는 두 대 이상이어야 합니다.");
        }
    }
}
