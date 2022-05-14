package racingCar.controller;

import racingCar.domain.Car;
import racingCar.service.RacingGameService;
import racingCar.view.RacingGameView;

import java.util.List;

public class RacingGameController {
    private final RacingGameService service;
    private final RacingGameView view;

    public RacingGameController(RacingGameService service, RacingGameView view) {
        this.service = service;
        this.view = view;
    }
    public void start(){
       String[] names = view.inputNames();
       //TODO 받은 이름들로 Car 객체들 만들어 넣어주기
       List<Car> carList;
       int rounds = view.inputRounds();
       service.start(carList, rounds);
    }
}
