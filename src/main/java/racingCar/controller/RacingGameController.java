package racingCar.controller;

import racingCar.domain.Car;
import racingCar.service.RacingGameService;
import racingCar.view.RacingGameView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameController {
    private final RacingGameService service;
    private final RacingGameView view;

    public RacingGameController(RacingGameService service, RacingGameView view) {
        this.service = service;
        this.view = view;
    }

    public void start(){
       List<String> names = new ArrayList<String>(view.inputNames());
       List<Car> carList = new ArrayList<>();
        for (String eachName : names){
            Car car = Car.of(eachName);
            carList.add(car);
        }
       int rounds = view.inputRounds();
       service.start(carList, rounds);
    }
}
