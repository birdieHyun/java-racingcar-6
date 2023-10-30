package racingcar.domain;

import java.util.Objects;

public class Position implements Comparable<Position>{

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

    @Override
    public int compareTo(Position compareTarget) {

        return Integer.compare(this.position, compareTarget.position);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {

        return Objects.hash(position);
    }
}
