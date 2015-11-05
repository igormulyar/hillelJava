package patterns.observer;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measurmentChanged();

        station.setPressure(25);
        station.setHumidity(55);
        station.setTemperature(16);

        station.measurmentChanged();

    }
}
