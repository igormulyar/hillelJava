package patterns.observer;

/**
 * Created by IMulyar on 05.11.2015.
 */
public class WeatherDisplay {

    int temperature;
    int humidity;
    int pressure;

    public void set(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
