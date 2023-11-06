package core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.core.Car;
import racingcar.core.RandomNumber;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @DisplayName("랜덤숫자가 4이상일 때 전진 확인")
    @ValueSource(ints={4,5,6,7,8,9})
    void car_전진확인(int input){
        Car car = new Car(0, input);
        car.moveForward();
        assertThat(car.getForwardCnt()).isEqualTo(1);
    }
    @ParameterizedTest
    @DisplayName("랜덤숫자가 4미만일 때 정지 확인")
    @ValueSource(ints={0,1,2,3})
    void car_정지확인(int input){
        Car car = new Car(0, input);
        car.moveForward();
        assertThat(car.getForwardCnt()).isEqualTo(0);
    }
}
