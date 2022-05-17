package racingCar.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NameValidator {
    private static final int MAX_LENGTH = 5;

    public static ArrayList<String> validateName(String nameString) {
        ArrayList<String> names = new ArrayList<>(List.of(nameString.split(",")));
        for(String eachName : names){
         checkNullAndEmpty(eachName);
         checkLength(eachName);
        }
        checkDuplicate(names);
        return names;
    }

    private static void checkDuplicate(ArrayList<String> names) {
        var setCars = new HashSet<>(names);
        if(names.size() != setCars.size()){
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }

    private static void checkNullAndEmpty(String name) {
        if(name==null||name.isEmpty()){
            throw new IllegalArgumentException("공백을 입력할 수 없습니다.");
        }
    }

    private static void checkLength(String name) {
        if(name.length()>MAX_LENGTH){
            throw new IllegalArgumentException("자동차 이름은 다섯 글자 이하로만 입력 가능합니다.");
        }
    }


}
