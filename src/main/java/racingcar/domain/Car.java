package racingcar.domain;

public class Car {

    private static final String POSITION_SYMBOL = "-";

    private final String name;
    private int position;

    public Car(String name) {

        this.name = name;
    }

    public static Car makeCar(String name) {

        return new Car(name);
    }

    public void move() {

        this.position++;
    }

    public String getName() {

        return name;
    }

    public String getPosition() {

        return POSITION_SYMBOL.repeat(position);
    }
}
