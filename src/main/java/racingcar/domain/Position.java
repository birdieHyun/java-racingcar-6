package racingcar.domain;

public class Position {

    private static final String POSITION_ERROR = "[ERROR] 위치는 0 이상이어야 합니다.";
    private static final int DEFAULT_POSITION = 0;
    private final int position;

    public Position(int position) {

        if (position < DEFAULT_POSITION) {
            throw new IllegalArgumentException(POSITION_ERROR);
        }
        this.position = position;
    }

    public Position move() {

        return new Position(position + 1);
    }

    public int value() {

        return position;
    }
}
