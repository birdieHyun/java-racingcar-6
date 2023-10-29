package racingcar.domain;

public class Car {

    private static final String POSITION_SYMBOL = "-";
    private static final String DEFAULT_POSITION = "";

    private final String name;
    private String position;

    public Car(String name) {

        this.name = name;
        this.position = DEFAULT_POSITION;
    }

    public static Car makeCar(String name) {

        return new Car(name);
    }

    public void move() {

        this.position += POSITION_SYMBOL;
    }

    public String getName() {

        return name;
    }

    public String getPosition() {

        return position;
    }
}
