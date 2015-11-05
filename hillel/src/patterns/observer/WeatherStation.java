package patterns.observer;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class WeatherStation {
    int temperature;
    int humidity;
    int pressure;

    WeatherDisplay current = new WeatherDisplay();
    WeatherStatistic statistic = new WeatherStatistic();


    public void measurmentChanged(){
        current.set(temperature, humidity, pressure);
        current.display();

        statistic.set(temperature, humidity, pressure);
        statistic.display();
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
