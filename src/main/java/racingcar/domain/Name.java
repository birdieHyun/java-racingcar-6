package racingcar.domain;


public record Name(String value) {

    private static final String CAR_NAME_LENGTH_ERROR = "[ERROR] 자동차 이름은 1글자 이상 5글자 이하만 가능합니다.";

    public Name {

        if (value.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
        }
    }
}
