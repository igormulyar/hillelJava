package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class WeatherStatistic implements WeatherObserver {
    List<Integer> temperatures = new ArrayList<>();
    List<Integer> humidities = new ArrayList<>();
    List<Integer> pressures = new ArrayList<>();


    @Override
    public void updateWeather(WeatherStation station) {
        this.temperatures.add(station.getTemperature());
        this.humidities.add(station.getHumidity());
        this.pressures.add(station.getPressure());
    }
    public void display () {
        System.out.println("Statistic \ntemperatures: " + temperatures  +
        ", humidities: " + humidities +
        ", pressures: " + pressures);
    }
}
