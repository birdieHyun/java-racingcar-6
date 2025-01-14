package racingcar;

import racingcar.controller.GameController;
import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {

        GameController gameController = new GameController(
                new GameService(),
                new InputView(),
                new OutputView()
        );

        gameController.playGame();
    }
}
