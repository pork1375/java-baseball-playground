package baseBall;

import java.util.List;

import static baseBall.Main.MAX_NUMBER;

public class IsErrorCheck {

    // 숫자 3자리가 맞는지 체크한다.
    public static void numbersSizeCheck(List<Integer> computerRandomNumbers) {
        if (computerRandomNumbers.size() != MAX_NUMBER) {
            throw new IllegalArgumentException("숫자 3자리가 아닙니다.");
        }
    }

}
