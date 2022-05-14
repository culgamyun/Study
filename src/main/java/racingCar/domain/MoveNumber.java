package racingCar.domain;

public class MoveNumber {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private int randomNumber;
    private static final int MOVE_FORWARD = 4;

    public MoveNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
        this.randomNumber = number;
    }

    boolean isProceedable(){
        return this.randomNumber>=MOVE_FORWARD;
    }
}
