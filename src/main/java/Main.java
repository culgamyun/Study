import racingCar.controller.RacingGameController;
import racingCar.service.RacingGameService;
import racingCar.view.RacingGameView;

public class Main {
    public static void main(String[] args) {
        var service = new RacingGameService();
        var view = new RacingGameView();
        var controller = new RacingGameController(service, view);
        controller.start();
    }
}
