package racingcar.domain;

public class Car {

    private static final int MOVE_CONDITION = 4;
    private static final int DEFAULT_POSITION = 0;
    private static final String POSITION_SYMBOL = "-";
    private final String name;
    private Position position;

    public Car(String name) {

        this.name = name;
        this.position = new Position(DEFAULT_POSITION);
    }

    public static Car makeCar(String name) {

        return new Car(name);
    }

    public void tryMove(int randomNumber) {

        if (isMove(randomNumber)) {
            this.position = position.move();
        }
    }

    private boolean isMove(int randomNumber) {

        return randomNumber >= MOVE_CONDITION;
    }

    public String getName() {

        return name;
    }

    public boolean isAtPosition(int position) {

        return this.position.value() == position;
    }

    public int getPositionValue() {

        return position.value();
    }

    public String getPositionSymbol() {

        return POSITION_SYMBOL.repeat(position.value());
    }
}
