package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public record Cars(List<Car> value) {

    public List<Name> findWinners() {

        Position maxPosition = value.stream()
                .map(Car::getPosition)
                .max(Position::compareTo)
                .orElse(new Position(0));

        return value.stream()
                .filter(car -> car.isAtPosition(maxPosition))
                .map(Car::getName)
                .toList();
    }

    public String getSingleRoundResult() {
        final String NEW_LINE = "\n";
        final String SEPARATOR = " : ";

        return value.stream()
                .map(car -> car.getNameValue() + SEPARATOR + car.getPositionSymbol())
                .collect(Collectors.joining(NEW_LINE)) + NEW_LINE;
    }
}
