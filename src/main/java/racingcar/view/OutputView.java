package racingcar.view;

import racingcar.domain.Car;

public class OutputView {

    private static final String START_GAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ASK_HOW_MANY_TIMES_TO_MOVE = "시도할 회수는 몇회인가요?";
    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String SEPARATOR =  " : ";

    public void printStartGameMessage() {

        System.out.println(START_GAME_MESSAGE);
    }

    public void askHowManyTimesToMove() {

        System.out.println(ASK_HOW_MANY_TIMES_TO_MOVE);
    }

    public void printResultMessage() {

        System.out.println(RESULT_MESSAGE);
    }

    public void printResult(Car car) {

        System.out.println(car.getName() + SEPARATOR + car.getPosition());
    }
}
