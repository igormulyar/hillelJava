package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class WeatherStatistic {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();



    public void set(int temperature, int humidity, int pressure) {
        this.temperatures.add(temperature);
        this.humidities.add(humidity);
        this.pressures.add(pressure);
    }
    public void display () {
        System.out.println(" Statistic \ntemperatures: " + temperatures  +
        ", humidities: " + humidities +
        ", pressures: " + pressures);
    }
}
