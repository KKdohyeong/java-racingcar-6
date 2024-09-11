package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private final List<Car> cars;


    public Cars(String msg){
        this.cars = new ArrayList<>();
        makeCars(splitMsg(msg));
    }




    public List<String> splitMsg(String msg){
        return  Arrays.asList(msg.split(","));
    }

    public void makeCars(List<String> msgs){
        for(String msg : msgs){
            Car car = new Car(msg.trim());
            cars.add(car);
        }
    }
}
