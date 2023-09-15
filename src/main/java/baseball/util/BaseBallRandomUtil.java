package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class BaseBallRandomUtil {
    public static Integer getRandomNumber() {
        return Randoms.pickNumberInList(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
