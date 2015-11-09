package patterns.observer;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
        WeatherDisplay current = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();
        WeatherForecast forecast = new WeatherForecast();

        station.register(current);
        station.register(statistic);
        station.register(forecast);

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measurmentChanged();

        current.display();
        statistic.display();
        forecast.display();

        station.removeObserver(current);

        station.setPressure(25);
        station.setHumidity(55);
        station.setTemperature(16);

        station.measurmentChanged();

        current.display();
        statistic.display();
        forecast.display();

    }
}
