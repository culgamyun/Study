package racingCar.domain;

public class Car {
    private static final int INITIAL_POSITION = 0;

    private String name;

    private int position;

    private Car(String name){
        this.name = name;
        this.position = INITIAL_POSITION;
    }

    public void moveFoward(MoveNumber number){
        if(number.isProceedable()){
            position++;
        }
    }
    public String getName() {
        return name;
    }
    public int getPosition(){
        return position;
    }

    public static Car of(String name) {
        return new Car(name);
    }
}
