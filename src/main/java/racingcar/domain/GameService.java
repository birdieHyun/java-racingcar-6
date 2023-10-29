package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class GameService {

    private int makeRandomNumberForMove() {

        return Randoms.pickNumberInRange(0, 9);
    }

    private boolean isMove(int randomNumber) {

        return randomNumber >= 4;
    }
}
