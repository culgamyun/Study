package racingCar.domain;

import org.junit.platform.commons.util.StringUtils;

public class NameValidator {
    private static final int MAX_LENGTH = 5;

    public static void validateName(String name) {
        checkNull(name);
        checkLength(name);
    }

    private static void checkNull(String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("공백을 입력할 수 없습니다.");
        }
    }

    private static void checkLength(String name) {
        if(name.length()>MAX_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 다섯 글자 이하로만 입력 가능합니다.");
        }
    }


}
