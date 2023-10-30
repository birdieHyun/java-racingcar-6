package racingcar.domain;

public record TryCount(int value) {

    private static final int MIN_TRY_COUNT = 0;
    private static final int MAX_TRY_COUNT = 1000;

    public TryCount {

        if (value < MIN_TRY_COUNT || value > MAX_TRY_COUNT) {
            throw new IllegalArgumentException("시도 횟수는 0보다 작을 수 없습니다.");
        }
    }
}
