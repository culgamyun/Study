package racingCar.view;

import racingCar.domain.NameValidator;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class RacingGameView {
    static NameValidator validator = new NameValidator();
    private static Scanner scanner = new Scanner(System.in);

    public String[] inputNames() {
        System.out.println("쉼표(',') 기준으로 자동차 이름을 입력하세요(이름 중복 불가)");
        String nameString = scanner.nextLine();
        String[] names = nameString.split(",");
        for(String eachName : names){
            validator.validateName(eachName);
        }
        return names;
    }

    public int inputRounds() {
        System.out.println("시도할 횟수를 입력하세요");
        String rounds = scanner.nextLine();
        return Integer.parseInt(rounds);
    }
}
