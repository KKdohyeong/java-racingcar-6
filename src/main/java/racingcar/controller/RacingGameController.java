package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;

public class RacingGameController {
    private final InputView inputView;

    public RacingGameController(InputView inputView) {
        this.inputView = inputView;
    }
    public void run(){
        Cars cars =  inputView.getCars();
    }
}
