package racingcar.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {

    @Test
    @DisplayName("자동차 이름이 두 대 이상이 아닐 경우 IllegalArgumentException 발생")
    void oneCarExceptionTest() {
        // given
        String cars = "pobi";

        // when


        // then
        assertThatThrownBy(() -> GameValidator.validateCarNumberIsOverTwo(cars))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차는 두 대 이상이어야 합니다.");
    }

    @Test
    @DisplayName("자동차가 두 대 이상일 경우 예외가 발생하지 않는다.")
    void test() {
        // given
        String cars = "pobi,woni";

        // when

        // then
        assertThatNoException().isThrownBy(() -> GameValidator.validateCarNumberIsOverTwo(cars));
    }
}